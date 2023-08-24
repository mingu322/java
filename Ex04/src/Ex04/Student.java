package Ex04;

public class Student {
	//필드
	private int no;
	private String name;
	private String address;
	private String phone;
	
	//기본생성자
	public Student() {
	
	}
	
	//생성자2
	public Student(int no, String name, String address, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

	//메서드
	
	
}
