package Ex09;
import java.sql.*;
import java.util.*;

public class UserDAO {
	Connection con = Database.connect();
	//포인트증가
	public void updatePoint(String id) {
		try {
			String sql = "UPDATE USERS SET POINT=POINT+10 WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.execute();
		}catch(Exception e) {
			System.out.println("사용자 포인트 증가 오류: " + e.toString());
		}
	}
	//사용자삭제
	public void delete(String uid) {
		try {
			String sql = "DELETE FROM USERS WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, uid);
			ps.execute();
		}catch(Exception e) {
			System.out.println("사용자 삭제 오류: " + e.toString());
		}
	}
	//사용자등록
	public void insert(UserVO vo) {
		try {
			String sql = "INSERT INTO USERS(ID, UNAME, PHONE) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2, vo.getUname());
			ps.setString(3, vo.getPhone());
			ps.setString(1, vo.getId());
			ps.execute();
		}catch(Exception e) {
			System.out.println("사용자 등록 오류: " + e.toString());
		}
	}
	//사용자수정
	public void update(UserVO vo) {
		try {
			String sql = "UPDATE USERS SET UNAME=?, PHONE=? WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getUname());
			ps.setString(2, vo.getPhone());
			ps.setString(3, vo.getId());
			ps.execute();
		}catch(Exception e) {
			System.out.println("사용자 수정 오류: " + e.toString());
		}
	}
	//사용자조회
	public UserVO read(String id) {
		UserVO vo = new UserVO();
		try {
			String sql = "SELECT * FROM USERS WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setUname(rs.getString("uname"));
				vo.setPoint(rs.getInt("point"));
				vo.setPhone(rs.getString("phone"));
			}
		}catch(Exception e) {
			System.out.println("사용자 목록 오류: " + e.toString());
		}
		return vo;
	}
	//사용자목록
	public List<UserVO> list(){
		List<UserVO> array = new ArrayList<>();
		try {
			String sql = "SELECT * FROM USERS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("id"));
				vo.setUname(rs.getString("uname"));
				vo.setPoint(rs.getInt("point"));
				vo.setPhone(rs.getString("phone"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("사용자 목록 오류: " + e.toString());
		}
		return array;
	}

}
