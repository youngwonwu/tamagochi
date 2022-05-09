package tamagochi.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DataSource;
import dto.TamaInfoVO;
import tamagochi.service.TamaInfoService;

public class TamaInfoServiceImpl implements TamaInfoService {

	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public TamaInfoVO tamaInfoSelect(TamaInfoVO vo) {
		//한개의 다마고치 조회
		String sql = "SELECT * FROM TAMAINFO WHERE NAME = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			rs = psmt.executeQuery();
			
			//아이디 비번이 맞을때 들고 와야하나...?????????????????????
//			if(rs.next()) {
//				vo = new TamaInfoVO();
//				
//		
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	@Override
	public int tamaInfoInsert(TamaInfoVO vo) {
		//추가
		int n = 0;
		String sql = "INSERT INTO TAMAINFO VALUES(?,DEFAULT,DEFAULT,DEFAULT,DEFAULT,?)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getId());
			
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int tamaInfoUpdate(TamaInfoVO vo) {
		//변경
		int n = 0;
		String sql = "UPDATE TAMAINFO NAME = ? WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getId());
			
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int tamaInfoDelete(TamaInfoVO vo) {
		//삭제
		int n = 0;
		String sql = "DELETE FROM TAMAINFO WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	private void close() {
		try {
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
