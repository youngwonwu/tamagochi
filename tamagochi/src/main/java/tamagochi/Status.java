package tamagochi;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Status {
	
	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();

	private String x = "■", o = "□";

	public void Info() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		
		System.out.println();
		System.out.println(tamaVO.getName() + "의 상태");
		System.out.print("배고픔 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getHungry() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 청결 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getClean() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 애정 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getTlike() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		
		System.out.print(" 건강 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getHealth() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}
		System.out.println();
	}

}
