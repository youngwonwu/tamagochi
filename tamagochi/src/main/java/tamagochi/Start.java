package tamagochi;

import java.util.Scanner;

import dto.TamaInfoVO;
import dto.TamagochiVO;
import lombok.Data;
import tamagochi.service.TamaInfoService;
import tamagochi.service.TamagochiService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;
import tamagochi.serviceImpl.TamagochiServiceImpl;

@Data
public class Start {
	
	Scanner sc = new Scanner(System.in);
	
	TamagochiVO tvo = new TamagochiVO();
	TamaInfoVO tivo = new TamaInfoVO();
	TamagochiService ts = new TamagochiServiceImpl();
	TamaInfoService tis = new TamaInfoServiceImpl();
	
	private String name;
	
	public void run() {
		start();
	}
	
	private void start() {
		
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println("○●	다	마	고	치	GAME	○●");
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println();
		System.out.println("○● 1.회원가입 2.로그인 3.비회원 4.종료 ○●");
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			//회원가입
			member();
			name();
			
		} else if(menu == 2) {
			//로그인
			login();
			
		} else if(menu == 3) {
			//비회원
			System.out.println("언제 할까..ㅜ");
			
		} else if(menu == 4){
			//종료
			System.out.println("○● byebye ○●");
			//break;
		}
		System.out.println();
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		System.out.println("○●	다	마	고	치	START	○●");
		System.out.println("○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●");
		
	}
	
	//회원가입
	private void member() {
		
		System.out.println("○● 가입할 아이디를 입력하세요! ○●");
		String id = sc.nextLine();
		
		tvo.setId(id);
		TamagochiApp.id = id;			//무슨 원리인지 아직 잘 모르겠다/.........ㅜ
		
		System.out.println("○● 가입할 비밀번호를 입력하세요! ○●");
		String pw = sc.nextLine();
		
		tvo.setPassword(pw);
		ts.tamagochiInsert(tvo);
	}
	
	private void login() {
		System.out.println("○●○● ID >> ○●○●");
		String id = sc.nextLine();
		
		System.out.println("○●○● PW >> ○●○●");
		String pw = sc.nextLine();
		
	}
	
	//비회원
	
	
	private void name() {
		
		System.out.println();
		System.out.println("○●○● 다마고치의 이름을 정해주세요~~ ○●○●");
		name= sc.nextLine();
		
		tivo.setId(tvo.getId());
		tivo.setName(name);
		tis.tamaInfoInsert(tivo);
		
		//나중에 다바고치 이름이 같을 경우 만들지 못하게 하기
//		int n = tis.tamaInfoInsert(tivo);
//		if(n==1) {
//			System.out.println("ok");
//		}
		
		System.out.println("○●○● 다마고치의 이름은 '" + name + "'입니다 ○●○●\n 열심히 키워보아요!! ۹(ÒہÓ)۶");
	}

}
