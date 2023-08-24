package day04;

import java.util.Scanner;

public class Ex10_스스로복습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while(run) {
			System.out.println("===자판기=== 잔액 : "+balance+"원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
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
					System.out.println("잔약 부족");
				}else {
					System.out.println("사이다 선택");
					balance -= 1200;
				}
			}else if(menu == 3) {
				if(balance<1500) {
					System.out.println("잔액 부족");
				}else {
					System.out.println("우유 선택");
					balance -= 1500;
				}
			}else if(menu == 4) {
				System.out.print("충전할 금액> ");
				int inMoney = sc.nextInt();
				balance += inMoney;
			}else if(menu == 0) {
				break;
			}
			System.out.println();
		}
		System.out.println("자판기 종료");
	
	}

}
