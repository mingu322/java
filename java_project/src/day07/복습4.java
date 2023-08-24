package day07;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		boolean account2 = false;
		
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌개설 2.입금 3.출금 4.계좌목록 5.이체 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름> ");
				name[cnt] = sc.next();
				System.out.print("계좌> ");
				account[cnt] = sc.next();
				System.out.print("금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println("계좌 개설 성공");
				
				cnt++;	
			}else if(menu == 2) {
				System.out.print("입금할 계좌 입력> ");
				String accountId = sc.next();
				System.out.print("입금 금액> ");
				int money = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(accountId.equals(account[i])) {
						balance[i] += money;
						System.out.printf("입금 완료");
						System.out.printf("잔액[%,d원]\n", balance[i]);
						find = true;
						break;	
					}
				}
				if(find == false) {
					System.out.println("없는 게좌번호 입니다");
				}
			}else if(menu == 3) {
				System.out.print("출금할 계좌 입력> ");
				String accountPw = sc.next();
				System.out.print("출금 금액> ");
				int money = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(accountPw.equals(account[i])) {
						if(balance[i] >= money) {
							balance[i] -= money;
							System.out.println("출금 완료");
							System.out.printf("잔액[%,d원]", balance[i]);
							find = true;
							break;
						}else {
							System.out.println("잔액 부족");
						}
					}
				}
				if(find == false) {
					System.out.println("없는 계좌번호 입니다");
				}
			}else if(menu == 4) {
				System.out.println("이름\t계좌\t잔액");
				System.out.println("========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}
			}else if(menu == 5) {
				System.out.print("출금할 계좌> ");
				String accountPw = sc.next();
				System.out.print("입금할 계좌> ");
				String accountId = sc.next();
				System.out.print("이체할 금액> ");
				int money = sc.nextInt();
				boolean find = false;
				int aIndex = -1;
				int bIndex = -1;
				
				for(int i=0; i<cnt; i++) {
					if(accountPw.equals(account[i])) {
						aIndex = i;
					}
					if(accountId.equals(account[i])) {
						bIndex = i;
					}
				}
				if(aIndex == -1) {
					System.out.println("출금계좌 없음");
				}else if(bIndex == -1) {
					System.out.println("입금계좌 없음");
				}else {
					if(balance[aIndex] >= money) {
						balance[aIndex] -= money;
						balance[bIndex] += money;
					}else {
						System.out.println("잔액부족");
					}
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