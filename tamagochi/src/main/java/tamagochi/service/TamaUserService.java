package tamagochi.service;

import java.util.List;

import dto.TamaUserVO;

public interface TamaUserService {
	
	//유저
	List<TamaUserVO> tamaUserSelect();	//회원조회
	int tamaUserInsert(TamaUserVO vo);	//추가
	int tamaUserUpdate(TamaUserVO vo);	//변경
	int tamaUserDelete(TamaUserVO vo);	//삭제

}
