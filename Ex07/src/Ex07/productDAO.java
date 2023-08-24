package Ex07;

import java.util.List;

public interface productDAO {
//	interface : 기본 설계도(리스트 ,리드 인서트, 딜리트 하는 기능)
	public void insert(ProductVO vo)throws Exception;
	public void update(ProductVO vo)throws Exception;
	public void delete(int pcode)throws Exception;
	public ProductVO read(int pcode)throws Exception;
	public List<ProductVO> list()throws Exception;
}
