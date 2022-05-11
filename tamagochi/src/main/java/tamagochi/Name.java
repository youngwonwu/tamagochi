package tamagochi;

import java.util.Scanner;

import dto.TamaInfoVO;
import lombok.Data;
import tamagochi.service.TamaInfoService;
import tamagochi.serviceImpl.TamaInfoServiceImpl;

@Data
public class Name {
	
	Scanner sc = new Scanner(System.in);
	
	TamaInfoVO tamaVO = new TamaInfoVO();
	TamaInfoService tamaSV = new TamaInfoServiceImpl();
	
	private String name;

	public void name() {
		
		System.out.println();
		System.out.println("○●○ 다마고치의 이름을 정해주세요~~ ○●○");
		name = sc.next();

		tamaVO.setId(Start.loginTama.getId());
		tamaVO.setName(name);
		tamaSV.tamaInfoInsert(tamaVO);

		// 나중에 다마고치 이름이 같을 경우 만들지 못하게 하기
//		int n = tis.tamaInfoInsert(tivo);
//		if(n==1) {
//			System.out.println("ok");
//		}

		System.out.println("○● 다마고치의 이름은 '" + name + "'입니다 ○●\n 열심히 키워보아요!! ۹(ÒہÓ)۶");
	}

}
