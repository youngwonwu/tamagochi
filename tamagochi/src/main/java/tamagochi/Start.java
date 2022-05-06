package tamagochi;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import lombok.Data;

@Data
public class Start {
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	
	public void run() {
		start();
		name();
	}
	
	private void start() {
		
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println("○●	다	마	고	치	start	○●");
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
//		System.out.println();
//		System.out.println("○● 1.로그인 2.비회원 3.종료 ○●");
//		int menu = sc.nextInt();
//		if(menu == 1) {
//			member();
//		} else if(menu == 2) {
//			System.out.println();
//		} else {
//			System.out.println("end of prog.");
//		}
		
	}
	
	//회원가입
	private void member() {
		System.out.println("");
	}
	
	//비회원
	
	private void name() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("○●○●다마고치의 이름을 정해주세요~~○●○●");
		name= sc.nextLine();
		
		System.out.println("○●○●다마고치의 이름은 '" + name + "'입니다○●○●\n 열심히 키워보아요!! ۹(ÒہÓ)۶");
//		State st = new State();
//		st.getStart().setName(name);
//		st.run();
	}

}
