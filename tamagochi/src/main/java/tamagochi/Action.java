package tamagochi;

import java.util.Scanner;

public class Action {

	Scanner sc = new Scanner(System.in);
	State state = new State();
	Start start = new Start();

	public void action() {
		System.out.println("○●○● 1.밥주기 2.샤워하기 3.청소하기 4.잠재우기 5.놀아주기(미니게임) ○●○●");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			eat();
			break;

		case 2:
			shower();
			break;

		case 3:
			clean();
			break;

		case 4:
			sleep();
			break;
		case 5:
			// 게임 불러오기
			break;
		}
	}

	public void eat() {
		//밥종류에 따라 포감도 다르게 하기
		System.out.println("○●○● 1.주먹밥(배고픔+10) 2.~~~~~~~ ○●○●");
		int eats = sc.nextInt();
		System.out.println("너무 맛있어요!! ᵈʕ ᵔⰙᵔ ʔᵇ");
		
		if(state.getHungry() > 100) {
			if(eats == 1) {
			state.setHungry(state.getHungry() + 10);
			System.out.println(start.getName());
			
			} else if(eats == 2) {
				
			} else if(eats == 3) {
				
			}
		}
		
		

	}

	public void shower() {
		
		System.out.println("상쾌해요!! (๑˘ꇴ˘๑)");

	}

	public void clean() {

	}

	public void sleep() {

	}

}
