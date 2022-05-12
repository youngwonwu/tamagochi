package tamagochi;

import java.util.Scanner;

import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

public class Action {

	Scanner sc = new Scanner(System.in);
	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();
	Status status = new Status();
	Game game = new Game();
	
	public void action() {
		
		
		while(true) {
			System.out.println();
			status.sleepTime(1000);
			System.out.println("○●○● 1.밥주기 2.샤워하기 3.잠재우기 4.놀아주기(미니게임) 5.종료 ○●○●");
			int menu = sc.nextInt();
			if(menu == 1) {
				// 밥주기
				eat();
				
			} else if(menu == 2) {
				// 샤워하기
				shower();
			} else if(menu == 3) {
				// 잠재우기
				sleep();
			} else if(menu == 4) {
				// 게임 불러오기
				game.game();
			} else {
				// 종료
				System.out.println("○● byebye ○●");
				break;
			}
		}
		
	}

	public void eat() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		
		boolean run = true;
		while(run) {
			// 밥종류에 따라 포만감도 다르게 하기
			System.out.println();
			System.out.println("○●○● 1.주먹밥 2.쥬스 3.박X스 4.초코렛 5.야채 6.돌아가기 ○●○●");
			int eats = sc.nextInt();
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
					//야채
					System.out.println("하하...핫");
					tamaVO.setHungry(tamaVO.getHungry() + 10);
					tamaVO.setClean(tamaVO.getClean() - 10);
					tamaVO.setTlike(tamaVO.getTlike() - 30);
					tamaVO.setHealth(tamaVO.getHealth() + 20);
				} else if (eats == 6) {
					run = false;
					break;
				}
			System.out.println("너무 맛있어요!! ᵈʕ ᵔⰙᵔ ʔᵇ");
			tamaSV.tamaInfoUpdate(tamaVO);
			status.InfoPrint();
		}
		
	}

	public void shower() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		System.out.println("상쾌해요!! ˚✧₊⁎( ˘ω˘ )⁎⁺˳✧༚");
		
			tamaVO.setClean(tamaVO.getClean() + 30);
			tamaVO.setHungry(tamaVO.getHungry() - 20);
			tamaVO.setTlike(tamaVO.getTlike() - 10);
			tamaVO.setHealth(tamaVO.getHealth() + 10);
		
		tamaSV.tamaInfoUpdate(tamaVO);
		status.InfoPrint();
	}

	public void sleep() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		System.out.println("'" +  tamaVO.getName() + "' 자고 있이요 ૮꒰ྀི ⸝⸝ᴗ͈ ‸ ᴗ͈⸝⸝ ꒱ྀིა");
		
			tamaVO.setHealth(tamaVO.getHealth() + 20);
			tamaVO.setClean(tamaVO.getClean() - 20);
			tamaVO.setHungry(tamaVO.getHungry() - 30);
			tamaVO.setTlike(tamaVO.getTlike() + 10);
		
		tamaSV.tamaInfoUpdate(tamaVO);
		status.InfoPrint();
	}
}
