package tamagochi.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DataSource;
import dto.TamaUserVO;
import tamagochi.service.TamaUserService;

public class TamaUserServiceImpl implements TamaUserService{
	
	private DataSource dao = DataSource.getInstance();
	private Connection conn =  dao.getConnection();
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<TamaUserVO> tamaUserSelect() {
		List<TamaUserVO> tamaList = new ArrayList<TamaUserVO>();
		TamaUserVO vo;
		//회원조회
		String sql = "SELECT * FROM TAMAUSER";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new TamaUserVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				tamaList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return tamaList;
	}
	@Override
	public int tamaUserInsert(TamaUserVO vo) {
		//추가
		int n = 0;
		String sql = "INSERT INTO TAMAUSER VALUES(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	@Override
	public int tamaUserUpdate(TamaUserVO vo) {
		//변경
		int n = 0;
		String sql = "UPDATE TAMAUSER PASSWORD = ? WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setString(2, vo.getId());
			
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	@Override
	public int tamaUserDelete(TamaUserVO vo) {
		//삭제
		int n = 0;
		String sql = "DELETE FROM TAMAUSER WHERE ID = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
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
