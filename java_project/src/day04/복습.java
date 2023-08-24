package day04;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");
		int number = sc.nextInt();
		
		
		if(number == 0) {
			System.out.println("0");
		}else if(number % 2 == 0) {
			System.out.println("0이 아닌 짝수");
		}else if(number % 2 == 1) {
			System.out.println("홀수");
		}
		
		if(number % 21 == 0) {
			System.out.println("3과 7의 배수");
		}else if(number % 3 == 0) {
			System.out.println("3의 배수");
		}else if(number % 7 == 0){
			System.out.println("7의 배수");
		}else {
			System.out.println("둘 다 아님");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
