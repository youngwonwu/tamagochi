package tamagochi;

import java.util.Scanner;

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
		while(isTrue) {
			System.out.println();
			System.out.println("○●○● 1.회원가입 2.로그인 3.비회원 ○●○●");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				//회원가입
				user.member();
				tama.name();
				
			} else if(menu == 2) {
				//로그인
				user.login();
				print.startPrint();;
				//스레드자리
				mt.run(true);
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
		//게임
	}

	
}
