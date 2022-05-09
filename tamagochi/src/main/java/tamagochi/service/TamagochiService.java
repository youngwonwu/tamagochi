package tamagochi.service;

import dto.TamagochiVO;

public interface TamagochiService {
	
	TamagochiVO tamagochiSelect(TamagochiVO vo);	//회원조회
	int tamagochiInsert(TamagochiVO vo);	//추가
	int tamagochiUpdate(TamagochiVO vo);	//변경
	int tamagochiDelete(TamagochiVO vo);	//삭제

}
