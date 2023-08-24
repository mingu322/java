package day06;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while(run) {
			System.out.printf("=====자판기=====[%,d원]\n", balance);
			System.out.println("1.콜라(1000원) 2.사이다(1200원) 3.우유(1500원) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(balance < 1000) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("콜라 선택");
					balance -= 1000;
				}
			}else if(menu == 2) {
				if(balance < 1200) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("사이다 선택");
					balance -= 1200;
				}
			}else if(menu == 3) {
				if(balance < 1500) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("우유 선택");
					balance -= 1500;
				}
			}else if(menu == 4) {
				System.out.print("충전할 금액> ");
				int money = sc.nextInt();
				balance += money;
				System.out.printf("충전 완료 / 잔액 : [%,d원]", balance);
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~4까지 선택하세요");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
