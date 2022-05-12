package tamagochi;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Status {

	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();

	private String x = "■", o = "□";

	public void InfoPrint() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		sleepTime(1000);
		System.out.println();
		System.out.println("'" + tamaVO.getName() + "'의 상태");
		System.out.print("배고픔 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getHungry() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}

		System.out.println();
		System.out.print(" 청결 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getClean() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}

		System.out.println();
		System.out.print(" 애정 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getTlike() / 10 >= i) {
				System.out.print(x);
			} else
				System.out.print(o);
		}

		System.out.println();
		System.out.print(" 건강 : ");
		for (int i = 1; i <= 10; i++) {
			if (tamaVO.getHealth() / 10 >= i) {
				System.out.print(x);
			} else 
				System.out.print(o);
		}
		
		System.out.println();
		warning();
	}

	public void warning() {
		if(tamaVO.getHungry() < 10 || tamaVO.getClean() < 10 ||tamaVO.getTlike() < 10||tamaVO.getHealth() < 10) {
			sleepTime(2000);
			System.out.println();
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉WARNING⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println();
			sleepTime(1000);
			System.out.println("다마고치의 이상반응이 감지되었습니다...");
		}
		
		
		if (tamaVO.getHungry() < 20) {
				sleepTime(1000);
				System.out.println();
				System.out.println("<위험>				<위험>");
				System.out.println("	아사 직전입니다.....(⬮꜆⬮)");
				System.out.println("<위험>				<위험>");
		} else if (tamaVO.getHungry() < 40) {
			sleepTime(1000);
			System.out.println();
			System.out.println("배고파 밥줘");
		}

		if (tamaVO.getClean() < 20) {
				sleepTime(1000);
				System.out.println();
				System.out.println("<위험>			<위험>");
				System.out.println("	아!! 더러워!!!!!");
				System.out.println("<위험>			<위험>");
		} else if (tamaVO.getClean() < 50) {
			sleepTime(1000);
			System.out.println();
			System.out.println("씻겨줘");
		}

		if (tamaVO.getTlike() < 10) {
				sleepTime(1000);
				System.out.println();
				System.out.println("<위험>				<위험>");
				System.out.println("	사랑과 관심을 주세요.....﻿ᴗ_ᴗ̩̩");
				System.out.println("<위험>				<위험>");
		} else if (tamaVO.getTlike() < 30) {
			sleepTime(1000);
			System.out.println();
			System.out.println("<경고> 심심해하고 있어요! <경고>");
		}

		if (tamaVO.getHealth() < 10) {
			sleepTime(1000);
			System.out.println();
			System.out.println("'" + tamaVO.getName() + "'의 건강이 안좋아 병원에 갑니다....");
		} else if (tamaVO.getHealth() < 30) {
			sleepTime(1000);
			System.out.println();
			System.out.println("<경고> 건강이 나빠졌어요! <경고>");
		}
		
		if(tamaVO.getHungry() < 10 || tamaVO.getClean() < 10 ||tamaVO.getTlike() < 10||tamaVO.getHealth() < 10) {
			sleepTime(1000);
			System.out.println();
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉WARNING⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
		}
		
	}

	//시간차 출력
	public void sleepTime(int sec) {
		long c = System.currentTimeMillis();
		while (true) {
			if ((System.currentTimeMillis() - c) >= sec) {
				break;
			}
		}
	}
	
	//공백출력
	public void blankPrint() {
		for(int i=1; i<=40; i++) {
			System.out.println();
		}
	}

}
