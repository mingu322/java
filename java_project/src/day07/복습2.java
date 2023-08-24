package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		String[] product = new String[100];
		int cnt = 0;
		int cok = 0;
		int sid = 0;
		int mil = 0;
		
		while(true) {
			System.out.println("1.콜라(1000원) 2.사이다(1200원) 3.우유선택(1500원) 4.구매 목록 0.종료");
			System.out.printf("=====자판기=====[%,d원]\n",balance);
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(balance < 1000) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("콜라 선택");
					balance -= 1000;
					product[cnt++] = "콜라";
					cok++;
				}
			}else if (menu == 2) {
				if(balance < 1200) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("사이다 선택");
					balance -= 1200;
					product[cnt++] = "사이다";
					sid++;
				}
			}else if(menu == 3) {
				if(balance < 1500) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("우유 선택");
					balance -= 1500;
					product[cnt++] = "우유";
					mil++;
				}
			}else if(menu == 4) {
				System.out.println("구매목록\t수량");
				System.out.println("=====");
				for(int i=0; i<cnt; i++) {
				System.out.println("콜라 : "+cok+"개");
				System.out.println("사이다 : "+sid+"개");
				System.out.println("우유 : "+mil+"개");
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
