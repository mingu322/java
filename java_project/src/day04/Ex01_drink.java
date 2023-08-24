package day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while(run) {
			System.out.printf("=====자판기=====[%d원]\n", balance);
			System.out.println("1.콜라(30000) 2.사이다(37000) 3.우유(60000) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			//콜라or사이다or우유or반복문종료
			if(menu == 1) {
				if(balance < 30000) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("콜라 선택");
					balance = balance - 30000;	
				}		
			}else if(menu == 2) {
				if(balance < 37000) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("사이다 선택");
					balance = balance - 37000;
				}
			}else if(menu == 3) {
				if(balance < 60000) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("우유 선택");
					balance = balance - 60000;
				}
			}else if(menu ==4) {
				System.out.print("충전할 금액> ");
				int inMoney = sc.nextInt();
				balance += inMoney;
			}else if(menu == 0){
				run = false;
			}else {
				System.out.println("다시 선택");
			}
			System.out.println();
		}
		System.out.println("반복문 종료");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
