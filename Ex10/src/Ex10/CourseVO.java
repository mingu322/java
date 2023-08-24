package Ex10;

public class CourseVO {
	private String Ccode;
	private String Cname;
	public String getCcode() {
		return Ccode;
	}
	public void setCcode(String ccode) {
		Ccode = ccode;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	@Override
	public String toString() {
		return "CourseVO [Ccode=" + Ccode + ", Cname=" + Cname + "]";
	}
	
	
}
