package Ex08;

import java.sql.*;
import java.util.*;

public class AccountDAO {
	Connection con = Database.connect();
	//잔액변경
	public void update(AccountVO vo) {
		try {
			String sql = "UPDATE ACCOUNT SET BALANCE=? WHERE ANO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getBalance());
			ps.setInt(2, vo.getAno());
			ps.execute(); 
		}catch(Exception e) {
			System.out.println("잔액 변경 오류: " + e.toString());
		}
	}
	//계좌목록
	public List<AccountVO> list(){
		List<AccountVO> array = new ArrayList<>();
		try {
			String sql = "SELECT * FROM ACCOUNT";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				AccountVO vo = new AccountVO();
				vo.setAno(rs.getInt("ano"));
				vo.setAname(rs.getString("aname"));
				vo.setBalance(rs.getInt("balance"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("계좌 목록 오류: " + e.toString());
		}
		return array;
	}
	//계좌생성
	public int insert(AccountVO vo) {
		int ano = 0;
		try {
			String sql = "INSERT INTO ACCOUNT(ANO, ANAME, BALANCE) VALUES(SEQ_ANO.NEXTVAL, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getAname());
			ps.setInt(2, vo.getBalance());
			ps.execute();
			
			sql = "SELECT SEQ_ANO.CURRVAL ano FROM dual";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) ano = rs.getInt("ano");
		}catch(Exception e) {
			System.out.println("계좌생성오류: " + e.toString());	
		}
		return ano;
		
	}
	//계좌정보 조회
	public AccountVO read(int ano)throws Exception {
		AccountVO vo= new AccountVO();
		String sql ="SELECT * FROM ACCOUNT WHERE ANO=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, ano);
		ResultSet rs = ps.executeQuery(); //ps가 하나면 if / 여러개면 while
		if(rs.next()) {
			vo.setAno(rs.getInt("ano"));
			vo.setAname(rs.getString("aname"));
			vo.setBalance(rs.getInt("balance"));
			}
		
		return vo;
	}
}
