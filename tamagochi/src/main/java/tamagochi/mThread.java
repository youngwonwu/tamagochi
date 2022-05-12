package tamagochi;

import dto.TamaInfoVO;
import lombok.Data;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

@Data
public class mThread {
	TamaInfoVO tamaVO;
	Status status;
	
	public void run() {
		multiThread();
	}
	
	private void multiThread() {

		
		Runnable hungryTask = new Runnable() {
			@Override
			public void run() {
				TamaInfoService tamaSV = new TamaInfoServiceImpl();
				tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
				status = new Status();
				while(true) {
					status.sleepTime(60000);
					tamaVO.setHungry(tamaVO.getHungry() - 30);
					tamaSV.tamaInfoUpdate(tamaVO);
				}
			}
		};
		
		
		Runnable cleanTask = new Runnable() {
			@Override
			public void run() {
				TamaInfoService tamaSV = new TamaInfoServiceImpl();
				tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
				status = new Status();
				while(true) {
					status.sleepTime(500000);
					tamaVO.setClean(tamaVO.getClean() - 20);
					tamaSV.tamaInfoUpdate(tamaVO);
				}
				
			}
		};
		Thread th1 = new Thread(hungryTask);
		Thread th2 = new Thread(cleanTask);
		
		th1.start();
		th2.start();
	}
	

	
	
	
}
