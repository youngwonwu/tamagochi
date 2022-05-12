package tamagochi;

import java.util.List;
import java.util.Scanner;

import dto.TamaUserVO;
import tamagochi.service.TamaUserService;
import tamagochi.serviceImpl.TamaUserServiceImpl;

public class Member {

	Scanner sc = new Scanner(System.in);

	TamaUserVO userVO = new TamaUserVO();
	TamaUserService userSV = new TamaUserServiceImpl();

	public void loadStatus() { // 상태 불러오기

	}

	// 회원가입
	public void member() {
		//sc.nextLine();
		System.out.println("○● 가입할 아이디를 입력하세요! ○●");
		String id = sc.nextLine();
		System.out.println("○● 가입할 비밀번호를 입력하세요! ○●");
		String pw = sc.nextLine();
		userVO.setId(id);
		userVO.setPassword(pw);
		Start.loginTama.setId(id);
		Start.loginTama.setPassword(pw);
		userSV.tamaUserInsert(userVO);
		
		// 아이디가 중복되지 않게 예외처리
	}

	// 로그인
	public void login() {
		System.out.println("○●○●	LOGIN	○●○●");
		System.out.println("○● ID>> ○●");
		String id = sc.nextLine();

		System.out.println("○● PW>> ○●");
		String pw = sc.nextLine();

		TamaUserServiceImpl tsi = new TamaUserServiceImpl();
		List<TamaUserVO> tamaList = tsi.tamaUserSelect();

		for (TamaUserVO vo : tamaList) {
			if (id.equals(vo.getId()) && pw.equals(vo.getPassword())) {
				Start.loginTama.setId(id);
				Start.loginTama.setPassword(pw);
				System.out.println("\n○● 로그인 되었습니다 ○● \n (ง˙∇˙)ว GO!GO! (ว˙∇˙)ง");
				return;
			} 
		}
		System.out.println("○● 아이디와 비밀번호가 일치하지 않습니다 ○●");

	}

	// 비회원

}
