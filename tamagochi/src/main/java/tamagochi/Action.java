package tamagochi;

import java.util.Scanner;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Action {

	Scanner sc = new Scanner(System.in);
	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();
	
	public void action() {
		System.out.println();
		System.out.println("○●○● 1.밥주기 2.샤워하기 3.잠재우기 4.놀아주기(미니게임) 5.종료 ○●○●");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			// 밥주기
			eat();
			break;
		case 2:
			// 샤워하기
			shower();
			break;
		case 3:
			// 잠재우기
			sleep();
			break;
		case 4:
			// 게임 불러오기
			break;
		case 5:
			// 종료
			System.out.println("○● byebye ○●");
			break;
		}
	}

	public void eat() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		
		// 밥종류에 따라 포감도 다르게 하기
		System.out.println("○●○● 1.주먹밥 2.쥬스 3.박X스 4.사탕 5.초코렛 ○●○●");
		int eats = sc.nextInt();
		System.out.println("너무 맛있어요!! ᵈʕ ᵔⰙᵔ ʔᵇ");

		if (tamaVO.getHungry() > 100) {
			if (eats == 1) {
				// 주먹밥
				tamaVO.setHungry(tamaVO.getHungry() + 30);
				tamaVO.setClean(tamaVO.getClean() - 10);
				tamaVO.setTlike(tamaVO.getTlike() + 10);
				tamaVO.setHealth(tamaVO.getHealth() + 10);

			} else if (eats == 2) {
				// 주스
				tamaVO.setHungry(tamaVO.getHungry() + 10);
				tamaVO.setClean(tamaVO.getClean() - 10);
				tamaVO.setTlike(tamaVO.getTlike() + 10);
				tamaVO.setHealth(tamaVO.getHealth() - 10);

			} else if (eats == 3) {
				// 박X스
				tamaVO.setHungry(tamaVO.getHungry() + 10);
				tamaVO.setClean(tamaVO.getClean() - 10);
				tamaVO.setTlike(tamaVO.getTlike() + 10);
				tamaVO.setHealth(tamaVO.getHealth() + 30);

			} else if (eats == 4) {
				// 사탕
				tamaVO.setHungry(tamaVO.getHungry() + 10);
				tamaVO.setClean(tamaVO.getClean() - 20);
				tamaVO.setTlike(tamaVO.getTlike() + 30);
				tamaVO.setHealth(tamaVO.getHealth() - 30);

			} else if (eats == 5) {
				// 초코렛
				tamaVO.setHungry(tamaVO.getHungry() + 10);
				tamaVO.setClean(tamaVO.getClean() - 20);
				tamaVO.setTlike(tamaVO.getTlike() + 30);
				tamaVO.setHealth(tamaVO.getHealth() - 30);
			}

		}
		
		tamaSV.tamaInfoUpdate(tamaVO);

	}

	public void shower() {
		System.out.println("상쾌해요!! ˚✧₊⁎( ˘ω˘ )⁎⁺˳✧༚");
		if (tamaVO.getClean() > 100) {
			tamaVO.setClean(tamaVO.getClean() + 30);
			tamaVO.setHungry(tamaVO.getHungry() - 10);
			tamaVO.setTlike(tamaVO.getTlike() - 10);
			tamaVO.setHealth(tamaVO.getHealth() + 10);
		}
		tamaSV.tamaInfoUpdate(tamaVO);
	}

	public void sleep() {
		System.out.println("가 자고 있이요 ૮꒰ྀི ⸝⸝ᴗ͈ ‸ ᴗ͈⸝⸝ ꒱ྀིა");
		if (tamaVO.getHealth() > 100) {
			tamaVO.setHealth(tamaVO.getHealth() + 20);
			tamaVO.setClean(tamaVO.getClean() - 10);
			tamaVO.setHungry(tamaVO.getHungry() - 20);
			tamaVO.setTlike(tamaVO.getTlike() + 10);
		}
		tamaSV.tamaInfoUpdate(tamaVO);
	}
}
