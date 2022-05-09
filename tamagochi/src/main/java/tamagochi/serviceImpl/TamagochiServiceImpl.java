package tamagochi.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DataSource;
import dto.TamagochiVO;
import tamagochi.service.TamagochiService;

public class TamagochiServiceImpl implements TamagochiService{
	
	private DataSource dao = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public TamagochiVO tamagochiSelect(TamagochiVO vo) {
		//한개의 유저 조회
		String sql = "SELECT * FROM TAMAGOCHI WHERE USERNO = ?";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new TamagochiVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}
	@Override
	public int tamagochiInsert(TamagochiVO vo) {
		//추가
		int n = 0;
		String sql = "INSERT INTO TAMAGOCHI VALUES(?,?)";
		try {
			conn = dao.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	@Override
	public int tamagochiUpdate(TamagochiVO vo) {
		//변경
		int n = 0;
		String sql = "UPDATE TAMAGOCHI PASSWORD = ? WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setString(2, vo.getId());
			
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	@Override
	public int tamagochiDelete(TamagochiVO vo) {
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
