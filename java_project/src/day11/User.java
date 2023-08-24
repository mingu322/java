package day11;

public class User {
	
	private String name;
	private String id;
	private String pw;
	
//	public User() {
//		
//	}
//	
//	public User(String name, String id, String pw) {
//		this.name = name;
//		this.id = id;
//		this.pw = pw;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getPw() {
//		return pw;
//	}
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//	public void print() {
//		System.out.printf("%s\t%s\t%s\n",name,id,pw);
//	}
//	
	// 기본생성자, 모든필드 매개선수로 받는 생성자
		
	public User() {
		
	}
	public User(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	// 매서드 (get/set)
	// 
	public String getName() { //객채.getName();
		return name;
	}
	public void setName(String name) { //객채.setName("안녕");
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	// 매서드 print 
	public void print() {
		System.out.println(name+"\t"+id+"\t"+pw);
	}
	
	
	
	
}
