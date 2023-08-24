package day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 9;
//		while(a < 10) {
//			System.out.println("반복");
//		}

//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("숫자입력> ");
//			int num = sc.nextInt();
//			if (num == 0) {
//				break;
//			}
//		}
//		System.out.println("반복종료");

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			if(num > 0) {
				if(num%15==0) {
					System.out.println("피즈버즈");
				}else if(num%3==0) {
					System.out.println("피즈");
				}else if(num%5==0) {
					System.out.println("버즈");
				}else {
					System.out.println(num);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
