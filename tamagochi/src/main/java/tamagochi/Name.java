package tamagochi;

import java.util.Scanner;

import dto.TamaInfoVO;
import dto.TamaUserVO;
import lombok.Data;
import main.TamagochiApp;
import tamagochi.service.TamaInfoService;
import tamagochi.service.TamaUserService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;
import tamagochi.serviceImpl.TamaUserServiceImpl;

@Data
public class Name {
	
	Scanner sc = new Scanner(System.in);
	
	TamaUserVO uservo = new TamaUserVO();
	TamaInfoVO tamavo = new TamaInfoVO();
	TamaUserService userS = new TamaUserServiceImpl();
	TamaInfoService tamaS = new TamaInfoServiceImpl();
	
	private String name;

	public void name() {
		
		System.out.println();
		System.out.println("○●○● 다마고치의 이름을 정해주세요~~ ○●○●");
		name = sc.nextLine();

		tamavo.setId(TamagochiApp.id);
		tamavo.setName(name);
		tamaS.tamaInfoInsert(tamavo);

		// 나중에 다마고치 이름이 같을 경우 만들지 못하게 하기
//		int n = tis.tamaInfoInsert(tivo);
//		if(n==1) {
//			System.out.println("ok");
//		}

		System.out.println("○●○● 다마고치의 이름은 '" + name + "'입니다 ○●○●\n 열심히 키워보아요!! ۹(ÒہÓ)۶");
	}

}
