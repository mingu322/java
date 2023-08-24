package day06;

import java.util.Scanner;

public class Ex01_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌정보 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("넣을 금액> ");
				balance[cnt] = sc.nextInt();
				System.out.printf("계좌생성 완료[%,d원]\n",balance[cnt]);
				
				cnt++;
			}else if(menu == 2) {
				System.out.print("입금할 계좌번호> ");
				String accountId = sc.next();
				System.out.print("입금할 금액> ");
				int money = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(accountId.equals(account[i])) {
						balance[i] += money;
						System.out.println("입금 완료");
						System.out.printf("잔액[%,d원]\n",balance[i]);
						find = true;
						break;
					}
				}if(find == false) {
					System.out.println("유효하지 않은 계좌번호 입니다");
				}
				
			}else if(menu == 3) {
				System.out.print("출금할 계좌번호> ");
				String accountId2 = sc.next();
				System.out.print("출금할 금액> ");
				int outMoney = sc.nextInt();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(accountId2.equals(account[i])) {
						if(balance[i] < outMoney) {
							System.out.println("잔액 부족");
						}else {
							balance[i] -= outMoney;
							System.out.println("출금 완료");
							System.out.printf("잔액[%,d원]\n",balance[i]);
						}
						find = true;
						break;
					} 
				}
				if(!find) {
					System.out.println("유효하지 않은 계좌번호 입니다");
				}
			}else if(menu == 4) {
				System.out.println("예금주\t계좌번호\t잔액\n");
				System.out.println("======================================================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i],account[i],balance[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~3까지 입력하시오");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}
