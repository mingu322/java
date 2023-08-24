package Ex08;

import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		AccountDAO adao = new AccountDAO();
		DetailDAO ddao = new DetailDAO();
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년MM월dd일 HH:mm:ss");
		boolean run=true;
		while(run) {
			System.out.println("\n\n******* 계좌관리 *****************************");
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 |2.계좌조회 |3.입금 |4.출금 |5.계좌목록 |6.계좌이체 |0.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			String menu=s.nextLine();
			switch(menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				System.out.print("계좌주명> ");
				String name = s.nextLine(); 
				if(name == "") break;
				AccountVO acc = new AccountVO();
				acc.setAname(name);
				
				int balance = input("초기입금액");
				if(balance == 0) break;
				
				acc.setBalance(balance);
//				System.out.println(acc.toString());
				System.out.println("새로운 계좌를 생성하실래요(예:y)?");
				String sel = s.nextLine();
				if(sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
					int newano = adao.insert(acc);
					
					//거래내역저장
					DetailVO dvo = new DetailVO();
					dvo.setAno(newano);
					dvo.setAmount(balance);
					dvo.setType("입금");
					ddao.insert(dvo);
					
					System.out.println(newano + "번 새로운 계좌가 생성되었습니다.");
				}
				break;
			case "2":
				while(true) {
				int ano = input("\n조회할 계좌번호");
				if(ano == 0) {
					System.out.println("조회 종료");
					break;
				}else {
					try {
						AccountVO vo = adao.read(ano);
						if(vo.getAname()==null) {
							System.out.println("해당계좌가 존재하지 않음");
						}else {
							System.out.println("계좌주: " + vo.getAname());
							System.out.println("잔액: " + df.format(vo.getBalance()));
							System.out.println("======================================================");
							System.out.printf("거래번호\t잔액\t\t입출금\t날짜\n");
							System.out.println("======================================================");
						}
						for(DetailVO svo:ddao.list(ano)) {
							System.out.printf("%d\t%s\t%s\t%s\n", 
									svo.getDno(), df.format(svo.getAmount()),svo.getType(), sdf.format(svo.getDdate()));
						}
					} catch (Exception e) {
						System.out.println("계좌조회오류: " + e.toString());
					}
				}
			}
				break;
			case "3":
					int ano = input("입금할 계좌번호");
					if(ano == 0) {
						System.out.println("입금 취소");
					}else {
						try {
							AccountVO acc1 = adao.read(ano);
							if(acc1.getAname()==null) {
								System.out.println("해당 계좌가 없습니다.");
							}else {
								System.out.println("계좌주: " + acc1.getAname());
								System.out.println("잔액: " + df.format(acc1.getBalance()));
								int amount = input("입금금액>");
								if(amount == 0) {
									System.out.println("입금 취소");
								}else {
									acc1.setBalance(acc1.getBalance()+amount);
									adao.update(acc1);
									DetailVO dvo = new DetailVO();
									dvo.setAno(ano);
									dvo.setType("입금");
									dvo.setAmount(amount);
									ddao.insert(dvo);
									System.out.println("입금 완료");
								}
							}
						} catch (Exception e) {
							System.out.println("조회 오류: " + e.toString());
						}
					}
				break;
			case "4":
				ano=input("출금 계좌번호");
				if(ano==0) {
					System.out.println("출금을 취소합니다.");
				}else {
					try {
						AccountVO acc2 = adao.read(ano);
						if(acc2.getAname()==null) {
							System.out.println("해당 계좌번호가 존재하지 않습니다.");
						}else {
							System.out.println("계좌주: " + acc2.getAname());
							System.out.println("잔액: " + df.format(acc2.getBalance()));
							boolean repeat = true;
							int amount=0;
							while(repeat) {
								amount = input("출금할 금액");
								if(amount==0) {
									System.out.println("출금을 취소합니다.");
									repeat = false;
								}else {
									if(acc2.getBalance()<amount) {
										System.out.println("잔액이 부족합니다.");
									}else {
										acc2.setBalance(acc2.getBalance()-amount);
										adao.update(acc2);
										DetailVO dvo = new DetailVO();
										dvo.setAno(ano);
										dvo.setType("출금");
										dvo.setAmount(amount);
										ddao.insert(dvo);
										System.out.println("출금이 완료되었습니다.");
										repeat = false;
									}
								}
							}
						}
					} catch (Exception e) {
						System.out.println("계좌 조회 오류: " + e.toString());
					}
				}
				break;
			case "5":
				System.out.println("계좌목록");
				for(AccountVO vo : adao.list()) {
					
					System.out.printf("%d\t%s\t%s\n", vo.getAno(), vo.getAname(), df.format(vo.getBalance()));
				}
				break;
			case "6":
				System.out.println("=============계좌이체============");
				int outAcc = input("출금할 계좌번호");
				if(outAcc == 0) {
					System.out.println("계좌 이체 취소");
				}else {
					try {
					AccountVO acc3 = adao.read(outAcc);
					if(acc3.getAname()==null) {
						System.out.println("출금 계좌번호가 존재하지 않습니다.");
					}else {
						boolean repeat = false;
						int inAcc = input("입금할 계좌번호");
						if(inAcc == 0) {
							System.out.println("계좌 이체 취소");
						}else {
							try {
								AccountVO acc4 = adao.read(inAcc);
								int intMoney = input("이체할 금액");
								if(acc4.getAname()==null) {
									System.out.println("입금 계좌번호가 존재하지 않습니다.");
								}else {
									if(acc3.getBalance()<acc4.getBalance()) {
										System.out.println("잔액 부족");
										repeat = false;
									}else {
										acc3.setBalance(acc3.getBalance()-intMoney);
										acc4.setBalance(acc4.getBalance()+intMoney);
										adao.update(acc3);
										DetailVO dvo2 = new DetailVO();
										dvo2.setAno(outAcc);
										dvo2.setType("출금");
										dvo2.setAmount(intMoney);
										ddao.insert(dvo2);
										adao.update(acc4);
										DetailVO dvo3 = new DetailVO();
										dvo3.setAno(inAcc);
										dvo3.setType("입금");
										dvo3.setAmount(intMoney);
										ddao.insert(dvo3);
										System.out.println("계좌 이체 완료");
										break;
									}
								}
							}catch(Exception f) {
								System.out.println("입금 계좌 오류: " + f.toString());
							}
						}
					}
				}catch(Exception e) {
						System.out.println("출금 계좌 오류: " + e.toString());
				}
			}
			break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
	}
	
	//숫자인지 체크하는 메서드
	public static int input(String title) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println(title + ">");
			String str = s.nextLine();
			try {
				if(str=="") return 0;
				else return Integer.parseInt(str);	
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요");
			}
		}
	}
}
