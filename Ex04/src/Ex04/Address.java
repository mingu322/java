package Ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address {
	public static void run() {
		Scanner s = new Scanner(System.in);
		boolean run = true; 
		//샘플데이터
		List<Student> array = new ArrayList<>();
		Student stu1 = new Student(10, "홍길동", "인천", "010-1111-1111");
		array.add(stu1);
		Student stu2 = new Student(11, "심청이", "서울", "010-2222-2222");
		array.add(stu2);
		Student stu3 = new Student(12, "이순신", "부산", "010-3333-3333");
		array.add(stu3);
		int last = 12;
		
		while(run) {
			System.out.println("==============================================");
			System.out.println("1.등록 | 2.목록 | 3.조회 | 4.수정 | 5.삭제 | 0.종료");
			System.out.println("==============================================");
			System.out.print("메뉴선택> ");
			String menu = s.nextLine();
			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램 종료");
				break;
			case "1":
				Student newStu = new Student();
				newStu.setNo(++last);
				System.out.println("학번> "+ newStu.getNo());
				System.out.print("이름> ");
				newStu.setName(s.nextLine());
				System.out.print("주소> ");
				newStu.setAddress(s.nextLine());
				System.out.print("전화번호> ");
				newStu.setPhone(s.nextLine());
				array.add(newStu);
				System.out.println("전체학생수" + array.size());
				break;
			case "2":
				for(Student vo:array) {
					System.out.printf("%d\t%s\t%s\t%s\n", vo.getNo(), vo.getName(), vo.getAddress(), vo.getPhone());
				}
				System.out.println(array.size()+"명이 등록되었습니다.");
				break;
			case "3":
				System.out.print("조회할 학번>");
				String search = s.nextLine();
				for(Student vo:array) {
					if(vo.getNo() == Integer.parseInt(search)) {
						System.out.println("이름> " + vo.getName());
						System.out.println("주소> " + vo.getAddress());
						System.out.println("전화번호> " + vo.getPhone());
					}
				}
				break;
			case "4":
				System.out.print("수정할 학번> ");
				String update = s.nextLine();
				for(Student vo:array) {
					if(vo.getNo() == Integer.parseInt(update)) {
						System.out.print("이름: " + vo.getName() + ">");
						String newName = s.nextLine();
						if(newName!="") vo.setName(newName);
						System.out.print("주소: " + vo.getAddress() + ">");
						String newAddress = s.nextLine();
						if(newAddress!="") vo.setAddress(newAddress);
						System.out.print("전화번호: " + vo.getPhone() + ">");
						String newPhone = s.nextLine();
						if(newPhone!="") vo.setPhone(newPhone);
					}
				}
				break;
			case "5":
				System.out.print("삭제할 학번> ");
				String delete = s.nextLine();
				for(Student vo:array) {
					if(vo.getNo() == Integer.parseInt(delete)) {
						array.remove(vo);
						System.out.println(vo.getName() + "학생 삭제완료.");
						break;
					}else {
						System.out.println("해당 학번은 일치하지 않습니다.");
					}
				}
				
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}
}

