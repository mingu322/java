package Ex05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO2 {
	Connection con = Database.connect();
	//학생 삭제
	public void delete(String sno) {
		try {
			String sql = "update Students set sname=?, dept=?, birthday=?, year=? where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생 수정 : " + e.toString());
		}
	}
	//학생 수정
	public void update(StudentVO vo) {
		try {
			String sql = "update Students set sname=?, dept=?, birthday=?, year=? where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(5, vo.getSno());
			ps.setString(1, vo.getSname());
			ps.setString(2, vo.getDept());
			ps.setString(3, vo.getBirthday());
			ps.setInt(4, vo.getYear());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생 수정 : " + e.toString());
		}
	}
	//학생 조회
	public StudentVO read(String sno) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "select * from students where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setYear(rs.getInt("year"));
			}
		}catch(Exception e) {
			System.out.println("학생 조회 : " + e.toString());
		}
		return vo;
	}
	//학생 입력
	public void insert(StudentVO vo) {
		try {
			String sql = "insert into students(sno, sname, dept, birthday) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSno());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getBirthday());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생입력 : " + e.toString());
		}
	}
	//학번 구하기
	public String getNo() {
		String no = "";
		try {
			String sql = "select max(sno)+1 no from students";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				no = rs.getString("no");
			}
		}catch(Exception e) {
			System.out.println("학번 구하기 : " + e.toString());
	}
		return no;
}
	//학생 목록
	public List<StudentVO> list(){
		List<StudentVO> array = new ArrayList<>();
		try {
			String sql = "select * from Students";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setYear(rs.getInt("year"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("학생 목록 : " + e.toString());
		}
		return array;	
	}
	
}
