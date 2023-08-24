package day05;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while(run) {
			System.out.printf("=====자판기=====[&,d원]\n",balance);
			System.out.println("1.콜라(1000원) 2.사이다(1500원) 3.우유(2000원) 4.충전 0.종료");
			 System.out.print("메뉴 입력> ");
			 int menu = sc.nextInt();
			
			 if(menu == 1) {
				 if(balance < 1000) {
					 System.out.println("잔액 부족");
				 }else {
					 System.out.println("콜라 선택");
					 balance -= 1000; 
				 }
				}else if(menu == 2) {
					if(balance < 1500) {
						System.out.println("잔액 부족");
					}else {
						System.out.println("사이다 선택");
						balance -= 1500;
					}
				}else if(menu == 3) {
					if(balance < 2000) {
						System.out.println("잔액 부족");
					}else {
						System.out.println("우유 선택");
						balance -= 2000;
					}
				}else if(menu == 4) {
					System.out.print("충전할 금액> ");
					int money = sc.nextInt();
					balance += money;
				}
				else if(menu == 0){
					break;
				}else {
					System.out.println("1~3까지 선택하시오");
				}
			 System.out.println();
		}
		System.out.println("시스템 종료");
		
		
		
		
	}

}
