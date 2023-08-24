package Ex11;

import java.util.*;

public class Facil { // 시설물관리
	public static void run() {
		Scanner s = new Scanner(System.in);
		FacilDAO fdao = new FacilDAO();
		CampDAO cdao = new CampDAO();
		boolean run = true;
		while (run) {
			System.out.println("\n\n*****************************시설물관리*********************************");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("■■■■■■■■■■■■■1.시설물목록 |2.캠핑장시설물등록 |3.캠핑장시설물삭제 |0.종료■■■■■■■■■■■■■");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("메뉴선택> ");
			String menu = s.nextLine();
			switch (menu) {
			case "0":
				run = false;
				System.out.println("메뉴로 돌아갑니다.");
				break;
			case "1":
				List<FacilVO> farray = fdao.list();
				for (FacilVO vo : farray) {
					System.out.printf("%s\t%s\n", vo.getFno(), vo.getFname());
				}
				break;
			case "2":
				System.out.print("캠핑장 번호> ");
				String cno = s.nextLine();
				if (cno == "") {
					System.out.println("시설물 등록을 취소합니다.");
					break;
				} else {
					CampVO cvo = cdao.read(cno);
					if (cvo.getCname() == null) {
						System.out.println("등록된 캠핑장이 없습니다.");
					} else {
						System.out.println("캠핑장 이름> " + cvo.getCname());
						System.out.println("\n-----------------------------------------");
						while (true) {
							System.out.println("등록된 시설물");
							List<CampFacilVO> array = fdao.list(cno);
							if (array.size() == 0) {
								System.out.println("등록된 시설물이 없습니다.");
							} else {
								for (CampFacilVO vo : array) {
									System.out.printf("%d:%s|", vo.getFno(), vo.getFname());
								} 
								System.out.println("\n-----------------------------------------");
							}
							List<FacilVO> aarray = fdao.list();
							for (FacilVO vo : aarray) {
								System.out.printf("%d:%s|", vo.getFno(), vo.getFname());
							}
							System.out.println("\n-----------------------------------------");
							System.out.print("시설물 번호>");
							String fno = s.nextLine();
							if (fno == "") {
								System.out.println("시설물 등록을 취소합니다.");
								break;
							} else {
								int error = checkFno(fno, array, aarray);
								System.out.println(error);
								if (error == 0) {
									fdao.insert(cno, Integer.parseInt(fno));
									System.out.println("시설물 등록 완료");
								}
							}
						}
					}
				}
				break;
			case "3":
				System.out.print("캠핑장번호> ");
				cno = s.nextLine();
				if(cno == "") {
					System.out.println("시설물 삭제를 취소합니다.");
				}else {
					CampVO cvo = cdao.read(cno);
					if(cvo.getCname()==null) {
						System.out.println("등록된 캠핑장이 없습니다.");
					}else {
						System.out.println("캠핑장이름: " + cvo.getCname());
						while(true) {
						List<CampFacilVO> array = fdao.list(cno);
						if(array.size()==0) {
							System.out.println("등록된 시설물이 없습니다.");
							break;
						}else {
							for(CampFacilVO vo:array) {
								System.out.printf("%d:%s|", vo.getFno(), vo.getFname());
							}
							System.out.println("\n-----------------------------------------");
							System.out.print("삭제할 시설물 번호> ");
							String fno = s.nextLine();
							if(fno == "") {
								System.out.println("시설물 삭제를 취소합니다.");
								break;
							}else {
								int error=checkDno(fno, array);
								if(error==0) {
									fdao.delete(cno, Integer.parseInt(fno));
									System.out.println("시설물 삭제완료");
								}
							}
							}
						}
					}
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
			break;
		}
	}
	//삭제할 시설물 번호가 있는지
	public static int checkDno(String fno, List<CampFacilVO> array) {
		int error=0;
		try {
			int no = Integer.parseInt(fno);
			boolean find = false;
			for(CampFacilVO vo:array) {
				if(vo.getFno()==no) find = true;
			}
			if(find==false) {
				System.out.println("등록되지 않은 시설물 입니다.");
				error=1;
			}
		}catch(Exception e) {
			error=2;
			System.out.println("숫자를 입력하세요.");
		}
		return error;
	}

	// 시설물번호를 체크하는 메서드
	public static int checkFno(String fno, List<CampFacilVO> array, List<FacilVO> aarray) {
		int error = 0;
		try {
			int no = Integer.parseInt(fno);
			boolean find = false;
			for (CampFacilVO vo : array) {
				if (vo.getFno() == no)
					find = true;
			}
			if (find) {
				error = 1;
			System.out.println("이미 등록된 시설물 입니다.");
			
			}
			
			find = false;
			for (FacilVO vo : aarray) {
				if (vo.getFno() == no)
					find = true;
			}
			if (find == false) {
				error = 2;
			System.out.println("등록된 시설물이 없습니다.");
			}
		} catch (Exception e) {
			error = 3;
			System.out.println("숫자를 입력하세요.");
		}

		return error;
	}
}
