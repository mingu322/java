package day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0; i < 10; i++) 4{
//			System.out.println("안녕하세요");
//		}
		
//		for(int i = 1; i <= 10; i=i+2) {
//			System.out.println(i);
//		}
		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) {
//			if(i == 10) {
//				System.out.println(i);
//			}else {
//				System.out.print(i+",");	
//			}
//		}
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//		}System.out.println(sum);
//		int cnt = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 7 == 0) {
//				cnt++;			}
//		}
//		System.out.println("1부터 100까지 7의배수 갯수 : "+cnt+"개");
		
//		int dan = 8;
//		System.out.println(dan+"단");
//		for(int i=1; i<10; i++) {
//			if(i == 5) {
//				System.out.println();
//				continue;
//			}
//			System.out.println(dan+" * "+i+" = "+(dan*i));
//		}
//		System.out.println(dan+"단 끝");
//		while(true) {
//			System.out.println("안녕");
//		}
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
		
//		while(a > 0) {
//			System.out.println("양수");
//		}
		
//		while(true) {
//			System.out.print("숫자입력> ");
//			int a = sc.nextInt();
//			if(a > 0) {
//				System.out.println("양수");
//			}else if(a < 0) {
//				System.out.println("음수");
//			}else if(a == 0){
//				break;
//			}
//		} 
//		System.out.println("반복문 종료");
		
		while(true) {
			System.out.print("숫자입력> ");
			int a = sc.nextInt();
			if(a == 0) {
				break;
			}else if(a % 2 == 0) {
				System.out.println("짝수");
			}else if(a % 2 == 1) {
				System.out.println("홀수");
			}
		} 
		System.out.println("반복문 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
