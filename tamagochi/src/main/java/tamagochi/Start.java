package tamagochi;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import dto.TamaUserVO;

public class Start {

	Scanner sc = new Scanner(System.in);

	Member user = new Member();
	Name tama = new Name();
	Status status = new Status();
	Action act = new Action();
	mThread mt = new mThread();
	Print print = new Print();

	public static TamaUserVO loginTama = new TamaUserVO();

	public void start() {

		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println("○●	다	마	고	치	GAME	○●");
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");

		boolean isTrue = true;
		while (isTrue) {
			System.out.println();
			System.out.println("○●○● 1.회원가입 2.로그인 ○●○●");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				// 회원가입
				user.member();
				tama.name();
				//isTrue = false;
			} else if (menu == 2) {
				// 로그인
				user.login();
				if (!StringUtils.isEmpty(loginTama.getId())) { // isEmpty() 는 boolean타입이고 string이 공백이거나 null이면 true(null)을 한다
				
					print.startPrint();
					mt.run(true);	// 스레드
					status.InfoPrint();
					act.action();
					isTrue = false;
				}
//			} else if(menu == 3) {
//				//비회원
//				System.out.println("언제 할까..ㅜ");
//				
//			}
			}
		}
	}
}