package tamagochi;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Call {
	
	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();
	Status status = new Status();
	
	public void call() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		int sec = 60;
		while(sec > 0) {
			status.sleepTime(1000);
			tamaVO.setHungry(tamaVO.getHungry() - 30);
			tamaVO.setClean(0);
			tamaSV.tamaInfoUpdate(tamaVO);
			sec--;
		}
		
	}

}
