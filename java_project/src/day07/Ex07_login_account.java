package day07;

import java.util.Scanner;

public class Ex07_login_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw	= new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		int loginIndex = -1;
		
		while(true) {
			System.out.println("로그인한 인덱스"+loginIndex);
			System.out.println("=====스마트뱅킹=====");
			if(loginIndex != -1) {
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료");	
			}else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");	
			}
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			
			if(menu == 1) {
				if(loginIndex != -1) {
					System.out.println("이름\t아이디\t비밀번호\t계좌번호");
					System.out.println("==================================");
					System.out.printf("%s\t%s\t%s\t%s\n", name[loginIndex], id[loginIndex], pw[loginIndex], account[loginIndex]);
				}else {
					System.out.print("이름> ");
					name[cnt] = sc.next();
					System.out.print("아이디> ");
					id[cnt] = sc.next();
					System.out.print("비밀번호> ");
					pw[cnt] = sc.next();
					System.out.print("계좌> ");
					account[cnt] = sc.next();
					System.out.print("잔액> ");
					balance[cnt] = sc.nextInt();
					System.out.println("회원 가입 성공");
					
					cnt++;
				}
			}else if(menu == 2) {
				if(loginIndex != -1) {
					loginIndex = -1;
					System.out.println("로그아웃 되었습니다");
				}else {
					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;
					
					for(int i=0; i<cnt; i++) {
						if(loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							System.out.println(name[i]+"님 반갑습니다!");
							find = true;
							loginIndex = i;
							break;
						}
					}
					if(find == false) {
						System.out.println("로그인 실패");
					}
				}
			}else if(menu == 3) {
				if(loginIndex != -1) {
					System.out.print("입금할 금액> ");
					balance[loginIndex] += sc.nextInt();
					System.out.printf("입금 성공, 잔액 : %,d원\n",balance[loginIndex]);
				}else {
					System.out.println("이름\t아이디\t비밀번호\t계좌\t잔액");
					System.out.println("=========================");
					for(int i=0; i<cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\t%,d\n",name[i], id[i], pw[i], account[i], balance[i]);
					}
				}
			}else if(menu == 4 && loginIndex != -1) {
					System.out.print("출금할 금액> ");
					int money2 = sc.nextInt();
					System.out.print("비밀번호> ");
					String outPw = sc.next();
					if(outPw.equals(pw[loginIndex])) {
						if(balance[loginIndex] >= money2) {
							balance[loginIndex] -= money2;
							System.out.printf("출금 완료, 잔액 : %,d원\n",balance[loginIndex]);
						}else {
							System.out.println("한도초과");
						}
					}else {
						System.out.println("비밀번호가 틀렸습니다");
					}
			}else if(menu == 5 && loginIndex != -1) {
				System.out.print("이체할 계좌번호> ");
				String sendAccount = sc.next();
				System.out.print("이체할 금액> ");
				int sendMoney = sc.nextInt();
				System.out.print("이체 비밀번호> ");
				String sendPw = sc.next();
				boolean find = false;
				
				if(sendPw.equals(pw[loginIndex])) {
					for(int i=0; i<cnt; i++) {
						if(sendAccount.equals(account[i])) {
							find = true;
							if(balance[loginIndex] >= sendMoney) {
								balance[loginIndex] -= sendMoney;
								balance[i] += sendMoney;
								System.out.printf("%,d원 계좌이체 완료", sendMoney);
							}else {
								System.out.println("한도초과");
							}
							break;
						}
					}	
				}else{
					System.out.println("비밀번호가 틀렸습니다");
				}
				if(find == false) {
					System.out.println("잘못된 계좌 정보 입니다");
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
	
}
