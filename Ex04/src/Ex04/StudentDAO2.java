package Ex04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO2 {
	Connection con = Database.connect();
	//학생수정
	public void update(Student vo) {
		try {
			String a = "update tbl_juso set name=?, juso=?, phone=? where no=?";
			PreparedStatement b = con.prepareStatement(a);
			b.setString(1, vo.getName());
			b.setString(2, vo.getAddress());
			b.setString(3, vo.getPhone());
			b.setInt(4, vo.getNo());
			b.execute();
		}catch(Exception e) {
			System.out.println("학생수정: " + e.toString());
		}
	}
	//학생삭제
	public void delete(int no) {
		try {
			String a = "delete from tbl_juso where no=?";
			PreparedStatement b = con.prepareStatement(a);
			b.setInt(1, no);
			b.execute();
			}catch(Exception e) {
			System.out.println("학생삭제: " + e.toString());
		}
	}
	//학생조회
	public void read(int no) {
		Student vo =new Student();
		try {
			String a = "select * from tbl_juso where no=?";
			PreparedStatement b = con.prepareStatement(a);
			b.setInt(1, no);
			ResultSet c = b.executeQuery();
			while(c.next()) {
				vo.setNo(c.getInt("no"));
				vo.setName(c.getString("name"));
				vo.setAddress(c.getString("juso"));
				vo.setPhone(c.getString("phone"));
			}
		}catch(Exception e) {
			System.out.println("학생조회: " + e.toString());
		}
	}
	//학생등록
	public void insert(Student vo) {
		try {
			String a = "insert into tbl_juso(no, name, juso, phone) values(?,?,?,?)";
			PreparedStatement b = con.prepareStatement(a);
			b.setInt(1, vo.getNo());
			b.setString(2, vo.getName());
			b.setString(3, vo.getAddress());
			b.setString(4, vo.getPhone());
			b.execute();
		}catch(Exception e) {
			System.out.println("학생등록: " + e.toString());
		}
	}
	//학생목록
	public List<Student> list(){
		List<Student> array = new ArrayList<>();
		try {
			String a = "select * from tbl_juso";
			PreparedStatement ps = con.prepareStatement(a);
			ResultSet b = ps.executeQuery();
			while(b.next()) {
				Student vo = new Student();
				vo.setNo(b.getInt("no"));
				vo.setName(b.getString("name"));
				vo.setAddress(b.getString("juso"));
				vo.setPhone(b.getString("phone"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("연결: " + e.toString());
		}
		return array;
	}
}
