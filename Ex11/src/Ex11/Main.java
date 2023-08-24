package Ex11;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CampDAO cdao = new CampDAO();
		boolean run=true;
		while(run) {
			System.out.println("\n\n**************************캠핑장관리******************************");
			System.out.println("------------------------------------------------------------------");
			System.out.println("■■■■■■■■■■■■■1.캠핑장목록 |2.캠핑장조회 |3.캠핑장정보수정 |0.종료■■■■■■■■■■■■■");
			System.out.println("■■■■■■■■■■■■■4.시설물관리 |5.유형관리  |6.캠핑장등록    |    ■■■■■■■■■■■■■");
			System.out.println("------------------------------------------------------------------");
			System.out.print("메뉴선택> ");
			String menu=s.nextLine();
			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1": //캠핑장 목록
				List<CampVO> array = cdao.list();
				for(CampVO vo:array) {
					System.out.printf("%s\t%-20s\t%s\t%s\n",
							vo.getCno(), vo.getCname(), vo.getJuso(), vo.getTel());
				}
				System.out.println(array.size() +  "개의 캠핑장이 등록되었습니다.");
				break;
			case "2": //캠핑장 조회
				while(true) {
					System.out.println("\n조회할번호>");
					String cno = s.nextLine();
					if(cno=="") {
						System.out.println("조회를 취소합니다.");
						break;
					}else {
						CampVO cvo = cdao.read(cno);
						if(cvo.getCname()==null) {
							System.out.println("해당이 존재하지 않습니다.");
						}else {
							System.out.println("캠핑장이름: " + cvo.getCname());
							System.out.println("캠핑장주소: " + cvo.getJuso());
							System.out.println("캠핑장전화: " + cvo.getTel());
						}
					}
				}
				break;
			case "3":
				while(true) {
					System.out.print("수정할 캠핑장 번호> ");
					String cno = s.nextLine();
					if(cno == "") {
						System.out.println("수정을 취소합니다.");
						break;
					}else {
						CampVO cvo2 = cdao.read(cno);
						if(cvo2.getCname()==null) {
							System.out.println("캠핑장이 존재하지 않습니다.");
						}else { //수정할 캠핑장이 있으면
							System.out.println("캠핑장 이름: " + cvo2.getCname());
							System.out.print("새로운 캠핑장 이름> ");
							String cname2 = s.nextLine();
							if(cname2 != "") cvo2.setCname(cname2);
							
							System.out.println("캠핑장 주소: " + cvo2.getJuso());
							System.out.print("새로운 캠핑장 주소> "); 
							String juso2 = s.nextLine();
							if(juso2 != "")	cvo2.setJuso(juso2);
							
							System.out.println("캠핑장 전화번호: " + cvo2.getTel());
							System.out.print("새로운 캠핑장 전화번호> ");
							String tel2 = s.nextLine();
							if(tel2 != "") cvo2.setTel(tel2);
							
//							System.out.println(cvo2.toString());
							System.out.println("수정하시겠습니까?");
							String sel = s.nextLine();
							if(sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
								//수정작업
								cdao.update(cvo2);
								System.out.println("수정이 완료되었습니다.");
							}else {
								System.out.println("수정이 취소되었습니다.");
							}
							break;
						}
					}
				}
				break;
			case "4":
				Facil.run();
				break;
			case "5":
				break;
			case "6": //새로운 캠핑장 등록
				CampVO cvo = new CampVO();
				cvo.setCno(cdao.getNo());
				System.out.println("새로운 번호> " + cvo.getCno());
				System.out.print("캠핑장 이름> ");
				String cname = s.nextLine();
				if(cname == "") {
					System.out.println("등록을 취소합니다.");
				}else {
					System.out.print("캠핑장 주소> ");
					String juso = s.nextLine();
					System.out.print("캠핑장 전화번호> ");
					String tel = s.nextLine();
					cvo.setCname(cname);
					cvo.setJuso(juso);
					cvo.setTel(tel);
//					System.out.println(cvo.toString());
					cdao.insert(cvo);
					System.out.println("새로운 캠핑장이 등록되었습니다.");
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}

}
