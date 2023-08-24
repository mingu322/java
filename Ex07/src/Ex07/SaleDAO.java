package Ex07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SaleDAO {
	Connection con = Database.connect();
	//상품별 판매현황
	public List<SaleVO> sum_list(){
		List<SaleVO> array = new ArrayList<>();
		try {
			String sql = "SELECT PCODE, PNAME, SUM(QNT), SUM(SPRICE*QNT) sum_sprice FROM VIEW_SALE GROUP BY PCODE, PNAME ORDER BY PCODE";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				SaleVO vo = new SaleVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setQnt(rs.getInt("SUM(QNT)"));
				vo.setSprice(rs.getInt("sum_sprice"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("상품별 판매현황: " + e.toString());
		}
		return array;
	}
	//판매등록
	public void insert(SaleVO vo)throws Exception{
		String sql = "INSERT INTO SALE(SCODE, PCODE, QNT, SPRICE) VALUES(SEQ_SCODE.NEXTVAL,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getPcode());
		ps.setInt(2, vo.getQnt());
		ps.setInt(3, vo.getSprice());
		ps.execute();
	}
	//상품별 판매목록
	public List<SaleVO> list(int pcode)throws Exception{
		List<SaleVO> array = new ArrayList<>();
		String sql = "SELECT * FROM SALE WHERE PCODE=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			SaleVO vo = new SaleVO();
			vo.setScode(rs.getInt("scode"));
			vo.setPcode(rs.getInt("pcode"));
			vo.setQnt(rs.getInt("qnt"));
			vo.setSprice(rs.getInt("sprice"));
			vo.setSdate(rs.getTimestamp("sdate"));
			array.add(vo);
		}
		return array;
	}
}
