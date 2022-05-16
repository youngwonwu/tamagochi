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
	private Connection conn = dao.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public TamaInfoVO tamaInfoSelect(String id) {
		TamaInfoVO vo = new TamaInfoVO();
		//한개의 다마고치 조회
		String sql = "SELECT * FROM TAMAGOCHI WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setHungry(rs.getInt("hungry"));
				vo.setClean(rs.getInt("clean"));
				vo.setTlike(rs.getInt("tlike"));
				vo.setHealth(rs.getInt("health"));
				vo.setId(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public int tamaInfoInsert(TamaInfoVO vo) {
		//추가
		int n = 0;
		String sql = "INSERT INTO TAMAGOCHI VALUES(?,DEFAULT,DEFAULT,DEFAULT,DEFAULT,?)";
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
	public int tamaInfoUpdate(TamaInfoVO vo) {
		//변경
		int n = 0;
		String sql = "UPDATE TAMAGOCHI SET HUNGRY = ?, CLEAN = ?, TLIKE = ?, HEALTH = ? WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getHungry());
			psmt.setInt(2, vo.getClean());
			psmt.setInt(3, vo.getTlike());
			psmt.setInt(4, vo.getHealth());
			psmt.setString(5, vo.getId());
			
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
		String sql = "DELETE FROM TAMAGOCHI WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			
			n = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
//	private void close() {
//		try {
//			if(rs != null)
//				rs.close();
//			if(psmt != null)
//				psmt.close();
//			if(conn != null)
//				conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}
