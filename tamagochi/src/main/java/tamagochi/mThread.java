package tamagochi;

import dto.TamaInfoVO;
import lombok.Data;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

@Data
public class mThread {
	TamaInfoVO tamaVO;
	Print print;
	public static boolean playing = false;

	public void run(boolean b) {
		multiThread(b);
	}
	
	private void multiThread(boolean b) {
		
		Runnable hungryTask = new Runnable() {
			@Override
			public void run() {
				TamaInfoService tamaSV = new TamaInfoServiceImpl();
				tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
				print = new Print();
//				while (true) {
//					
//					if(playing) {
//						System.out.println(playing);
//						break;
//					}else {
//						print.sleepTime(10000);
//						tamaVO.setHungry(tamaVO.getHungry() - 20);
//						tamaSV.tamaInfoUpdate(tamaVO);
//						System.out.println("배고픔 -20");
//					}
//				}
				int s = 3;
				while(s>0) {
					if(!playing) {
						print.sleepTime(1000);
						s--;						
					}
					if(playing) {
						s=0;
					}
				}
				tamaVO.setHungry(tamaVO.getHungry() - 5);
				tamaVO.setClean(tamaVO.getClean() - 5);
				tamaVO.setTlike(tamaVO.getTlike() - 5);
				tamaVO.setHealth(tamaVO.getHealth() - 5);
				tamaSV.tamaInfoUpdate(tamaVO);
			}
		};

//		Runnable cleanTask = new Runnable() {
//			@Override
//			public void run() {
//				TamaInfoService tamaSV = new TamaInfoServiceImpl();
//				tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
//				print = new Print();
////				while (true) {
////					if(playing) {
////						break;
////					}else {
////						print.sleepTime(20000);
////						tamaVO.setClean(tamaVO.getClean() - 20);
////						tamaSV.tamaInfoUpdate(tamaVO);
////						System.out.println("청결 -20");
////					}
////				}
//				int s = 20;
//				while(s>0) {
//					if(!playing) {
//						print.sleepTime(3000);
//						s--;						
//					}
//					if(playing) {
//						s=0;
//					}
//				}
//				tamaVO.setClean(tamaVO.getClean() - 1);
//			}
//		};
		

		
		Thread th1 = new Thread(hungryTask);
		//Thread th2 = new Thread(cleanTask);

		if(b) {
			th1.start();
			//th2.start();
		} else {
			th1.stop();
			//th2.stop();
		}
		
	}
}
