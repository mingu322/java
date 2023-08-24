package Ex05;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Mains {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년MM월dd일");
		Scanner s = new Scanner(System.in);boolean run = true;
		while(run) {
			System.out.println("============학생관리================");
			System.out.println("------------------------------------");
			System.out.println("1.입력 2.조회 3.목록 4.수정 5.삭제 0.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();
			switch(menu) {
			case "0":
				run=false;
				System.out.println("프로그램 종료");
				break;
			case "1":
				StudentVO stu = new StudentVO();
				stu.setSno(dao.getNo());
				System.out.println("학번 : " + stu.getSno());
				System.out.print("이름> ");
				stu.setSname(s.nextLine());
				stu.setDept("컴정");
				System.out.println("학과> " + stu.getDept());
				stu.setBirthday("2000-01-02");
				System.out.println("생일> " + stu.getBirthday());
				dao.insert(stu);
				System.out.println(stu.getSname() + "학생이 등록되었습니다.");
				break;
			case "2":
				System.out.print("조회할 학번> ");
				String sno = s.nextLine();
				StudentVO stu2 = dao.read(sno);
				if(stu2.getSname()==null) {
					System.out.println(sno + "번 학생이 존재하지 않음");
				}else {
					System.out.println("이름> " + stu2.getSname());
					System.out.println("학과> " + stu2.getDept());
					System.out.println("생일> " + stu2.getBirthday());
					System.out.println("학번> " + stu2.getYear());
				}
				break;
			case "3":
				for(StudentVO vo:dao.list()) {
					System.out.printf("%s\t%s\t%s\t%s\n", vo.getSno(), vo.getSname(), vo.getDept(), vo.getBirthday());
				}
				break;
			case "4":
				System.out.print("수정할 학번> ");
				String uno = s.nextLine();
				StudentVO stu4 = dao.read(uno);
				if(stu4.getSname()==null) {
					System.out.println(uno + "번 학생이 존재하지 않음");
				}else {
					System.out.println("이름: " + stu4.getSname() + ">");
					String newSname = s.nextLine();
					if(newSname!="") stu4.setSname(newSname);
					System.out.println("학과: " + stu4.getDept() + ">");
					String newDept = s.nextLine();
					if(newDept!="") stu4.setDept(newDept);
					System.out.println("생일: " + stu4.getBirthday() + ">");
					String newBirthday = s.nextLine();
					if(newBirthday!="") stu4.setBirthday(newBirthday);
					System.out.println("학년: " + stu4.getYear() + ">");
					String newYear = s.nextLine();
					if(newYear!="") stu4.setYear(Integer.parseInt(newYear));
					System.out.println(stu4.toString());
					System.out.println("수정하시겠습니까(Y/y)?");
					String sel1 = s.nextLine();
					if(sel1.equals("Y") || sel1.equals("y") || sel1.equals("ㅛ")) {
						dao.delete(uno);
						System.out.println("삭제완료");
					}
				}
				break;
			case "5":
				System.out.println("삭제할 학번> ");
				String dno = s.nextLine();
				StudentVO stu3 = dao.read(dno);
				if(stu3.getSname()==null) {
					System.out.println(dno + "번 학생이 존재하지 않음");
				}else{
					System.out.println(stu3.toString());
					System.out.println("삭제하시겠습니까(Y/y)?");
					String sel = s.nextLine();
					if(sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
						dao.delete(dno);
						System.out.println("삭제완료");
					}
				}
				break;
			default:
				System.out.println("메뉴를 다시 입력하세요");
			}
		}
	}

}
