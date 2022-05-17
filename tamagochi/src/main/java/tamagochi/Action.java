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
	mThread mt = new mThread();
	Print print = new Print();

	public void action() {

		boolean isTrue = true;
		while (isTrue) {
			
			print.sleepTime(2000);
			print.blankPrint();
			System.out.println("○●○● 1.밥주기 2.샤워하기 3.잠재우기 4.놀아주기(미니게임) 5.종료 ○●○●");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 밥주기
				eat();
			} else if (menu == 2) {
				// 샤워하기
				shower();
			} else if (menu == 3) {
				// 잠재우기
				sleep();
			} else if (menu == 4) {
				// 게임 불러오기
				game.game();
			} else {
				// 종료
				mThread.playing = true;
				mt.run(false);
				isTrue = false;
				System.out.println("○● byebye ○●");
				return;
			}
		}
	}

	public void limits() {
		if (tamaVO.getHungry() >= 100) {
			tamaVO.setHungry(100);
		}
		if (tamaVO.getClean() >= 100) {
			tamaVO.setClean(100);
		}
		if (tamaVO.getTlike() >= 100) {
			tamaVO.setTlike(100);
		}
		if (tamaVO.getHealth() >= 100) {
			tamaVO.setHealth(100);
		}
	}

	public void eat() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());

		boolean run = true;
		while (run) {
			// 밥종류에 따라 포만감도 다르게 하기
			System.out.println();
			System.out.println("○●○● 1.주먹밥 2.쥬스 3.박X스 4.초코렛 5.야채 6.돌아가기 ○●○●");
			int eats = sc.nextInt();
			if (tamaVO.getHungry() > 0 && tamaVO.getHungry() <= 100 && tamaVO.getClean() > 0 && tamaVO.getClean() <= 100
					&& tamaVO.getHealth() > 0 && tamaVO.getHealth() <= 100 && tamaVO.getTlike() > 0
					&& tamaVO.getTlike() <= 100) {
				if (eats == 1) {
					// 주먹밥
					tamaVO.setHungry(tamaVO.getHungry() + 30);
					tamaVO.setTlike(tamaVO.getTlike() + 10);
					tamaVO.setHealth(tamaVO.getHealth() + 10);
					tamaVO.setClean(tamaVO.getClean() - 10);
					limits();

				} else if (eats == 2) {
					// 주스
					tamaVO.setHungry(tamaVO.getHungry() + 10);
					tamaVO.setClean(tamaVO.getClean() - 10);
					tamaVO.setTlike(tamaVO.getTlike() + 10);
					tamaVO.setHealth(tamaVO.getHealth() - 10);
					limits();

				} else if (eats == 3) {
					// 박X스
					tamaVO.setHungry(tamaVO.getHungry() + 10);
					tamaVO.setClean(tamaVO.getClean() - 10);
					tamaVO.setTlike(tamaVO.getTlike() + 10);
					tamaVO.setHealth(tamaVO.getHealth() + 30);
					limits();

				} else if (eats == 4) {
					// 사탕
					tamaVO.setHungry(tamaVO.getHungry() + 10);
					tamaVO.setClean(tamaVO.getClean() - 20);
					tamaVO.setTlike(tamaVO.getTlike() + 30);
					tamaVO.setHealth(tamaVO.getHealth() - 30);
					limits();

				} else if (eats == 5) {
					// 야채
					System.out.println("하하...핫");
					tamaVO.setHungry(tamaVO.getHungry() + 10);
					tamaVO.setClean(tamaVO.getClean() - 10);
					tamaVO.setTlike(tamaVO.getTlike() - 30);
					tamaVO.setHealth(tamaVO.getHealth() + 20);
					limits();
					
				} else if (eats == 6) {
					run = false;
					break;
				}
			}
			print.sleepTime(1000);
			System.out.println("너무 맛있어요!! ᵈʕ ᵔⰙᵔ ʔᵇ");
			tamaSV.tamaInfoUpdate(tamaVO);
			status.InfoPrint();
		}
	}

	public void shower() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		print.sleepTime(1000);
		System.out.println("상쾌해요!! ˚✧₊⁎( ˘ω˘ )⁎⁺˳✧༚");

		if (tamaVO.getHungry() > 0 && tamaVO.getHungry() <= 100 && tamaVO.getClean() > 0 && tamaVO.getClean() <= 100
				&& tamaVO.getHealth() > 0 && tamaVO.getHealth() <= 100 && tamaVO.getTlike() > 0 && tamaVO.getTlike() <= 100) {

			tamaVO.setClean(tamaVO.getClean() + 30);
			tamaVO.setHealth(tamaVO.getHealth() + 10);
			tamaVO.setHungry(tamaVO.getHungry() - 20);
			tamaVO.setTlike(tamaVO.getTlike() - 10);
			limits();
		}
		tamaSV.tamaInfoUpdate(tamaVO);
		status.InfoPrint();
	}

	public void sleep() {
		tamaVO = tamaSV.tamaInfoSelect(Start.loginTama.getId());
		print.sleepTime(1000);
		System.out.println("'" + tamaVO.getName() + "' 자고 있이요 ૮꒰ྀི ⸝⸝ᴗ͈ ‸ ᴗ͈⸝⸝ ꒱ྀིა");

		if (tamaVO.getHungry() > 0 && tamaVO.getHungry() <= 100 && tamaVO.getClean() > 0 && tamaVO.getClean() <= 100
				&& tamaVO.getHealth() > 0 && tamaVO.getHealth() <= 100 && tamaVO.getTlike() > 0 && tamaVO.getTlike() <= 100) {

			tamaVO.setHealth(tamaVO.getHealth() + 20);
			tamaVO.setClean(tamaVO.getClean() - 20);
			tamaVO.setHungry(tamaVO.getHungry() - 30);
			tamaVO.setTlike(tamaVO.getTlike() + 10);
			limits();
		}
		tamaSV.tamaInfoUpdate(tamaVO);
		status.InfoPrint();
	}
}
