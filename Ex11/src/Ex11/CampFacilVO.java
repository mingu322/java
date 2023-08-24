package Ex11;

public class CampFacilVO extends FacilVO {
	private String cno;
	private int fno;

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public int getFno() {
		return fno;
	}

	public void setFno(int fno) {
		this.fno = fno;
	}

	@Override  // 상속받은 fname도 toString하쟈
	public String toString() {
		return "CampFacilVO [cno=" + cno + ", fno=" + fno + ", getFname()=" + getFname() + "]";
	}

	
}
