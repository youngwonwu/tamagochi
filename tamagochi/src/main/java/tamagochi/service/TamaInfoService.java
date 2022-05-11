package tamagochi.service;

import dto.TamaInfoVO;

public interface TamaInfoService {
	
	//다마고치
	TamaInfoVO tamaInfoSelect(String id);	//한개의 다마고치 조회
	int tamaInfoInsert(TamaInfoVO vo);	//추가
	int tamaInfoUpdate(TamaInfoVO vo);	//변경
	int tamaInfoDelete(TamaInfoVO vo);	//삭제
	

}
