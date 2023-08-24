package day04;

import java.util.Scanner;

public class Ex04_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("=====계산기=====");
			System.out.print("첫번째 숫자 입력> ");
			int num1 = sc.nextInt();
			
			
			String cal = "";
			while(true) {
				System.out.print("연산자 선택> ");
				cal = sc.next();
				if(cal.equals("+") || cal.equals("-") || cal.equals("*") || cal.equals("/") || cal.equals("%")) {
					break;
				}else {
					System.out.println("사용할 수 없는 연산자 입니다.");
				}
			}
			
			System.out.print("두번째 숫자 입력> ");
			int num2 = sc.nextInt();
			if(cal.equals("+")) {
				System.out.println(num1+num2);
			}else if(cal.equals("-")) {
				System.out.println(num1-num2);
			}else if(cal.equals("*")) {
				System.out.println(num1*num2);
			}else if(cal.equals("/")) {
				System.out.println(num1/num2);
			}else if(cal.equals("%")) {
				System.out.println(num1%num2);
			}else {
				break;
			}
			System.out.println();
		}
		System.out.println("계산기 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
