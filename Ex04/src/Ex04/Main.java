package Ex04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO();
//		System.out.println(dao.read(20));
		
		//입력
//		Student stu = new Student(20,"조민규", "인천", "010-1234-5678");
//		dao.insert(stu);
		
		//수정
		Student stu = new Student(13,"강감찬", "서울", "010-4563-2345");
		dao.update(stu);
		
		//목록출력
//		dao.delete(12);
		for(Student vo:dao.list()) {
			System.out.println(vo.toString());
		}
	}

}
