package tamagochi;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Status {

	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();
	Print print = new Print();

	private String x = "■", o = "□";

	public void InfoPrint() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		print.sleepTime(1000);
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

		if (tamaVO.getHungry() < 20 || tamaVO.getClean() < 20 || tamaVO.getTlike() < 20 || tamaVO.getHealth() < 10 ||
				tamaVO.getHungry() > 0 || tamaVO.getClean() > 0 || tamaVO.getTlike() > 0 || tamaVO.getHealth() > 0) {
			
			print.sleepTime(2000);
			System.out.println();
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉WARNING⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println();
			print.sleepTime(1000);
			System.out.println("다마고치의 이상반응이 감지되었습니다...");
		}

		if (tamaVO.getHungry() < 20) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("<위험>				<위험>");
			System.out.println("	아사 직전입니다.....(⬮꜆⬮)");
			System.out.println("<위험>				<위험>");
			
		} else if (tamaVO.getHungry() < 40) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("배고파 밥줘");
			
		} else if(tamaVO.getHungry() == 0) {
			System.out.println("");
			tamaSV.tamaInfoDelete(tamaVO);
		}

		
		if (tamaVO.getClean() < 20) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("<위험>			<위험>");
			System.out.println("	아!! 더러워!!!!!");
			System.out.println("<위험>			<위험>");
			
		} else if (tamaVO.getClean() < 50) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("씻겨줘");
			
		} else if(tamaVO.getClean() == 0) {
			System.out.println("");
			tamaSV.tamaInfoDelete(tamaVO);
		}

		
		if (tamaVO.getTlike() < 10) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("<위험>				<위험>");
			System.out.println("	사랑과 관심을 주세요.....﻿ᴗ_ᴗ̩̩");
			System.out.println("<위험>				<위험>");
		} else if (tamaVO.getTlike() < 30) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("<경고> 심심해하고 있어요! <경고>");
		} else if(tamaVO.getHungry() == 0) {
			System.out.println("");
			tamaSV.tamaInfoDelete(tamaVO);
		}

		
		if (tamaVO.getHealth() < 10) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("'" + tamaVO.getName() + "'의 건강이 안좋아 병원에 갑니다....");
		} else if (tamaVO.getHealth() < 30) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("<경고> 건강이 나빠졌어요! <경고>");
		} else if(tamaVO.getHungry() == 0) {
			System.out.println("");
			tamaSV.tamaInfoDelete(tamaVO);
		}

		
		if (tamaVO.getHungry() < 10 || tamaVO.getClean() < 10 || tamaVO.getTlike() < 10 || tamaVO.getHealth() < 10) {
			print.sleepTime(1000);
			System.out.println();
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉WARNING⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
			System.out.println("⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉⨉");
		}
	}

}
