package day05;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = { 5, 6, 7, 8, 9 };
//		for(int i=0; i<a.length; i++){
//			if(i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i]+",");
//		}

		// a배열의 전체 합 출력
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println(sum);

//		Scanner sc = new Scanner(System.in);
//		int[] b = new int[10];
////		
//		for (int i = 0; i < b.length; i++) {
//			System.out.print("b배열의 " + i + " 번째 인덱스> ");
//			b[i] = sc.nextInt();
//		}
		//
//		}
//		 for(int i=0; i<b.length; i++) {
//			 if(i % 2 == 0) {
//				 System.out.println(b[i]); 
//			 }
//					
//		}

//			}
//		for(int i=0; i<b.length; i++) {
//			if(b[i] % 2 == 0) {
//				System.out.println(b[i]);
//			}
//			int sum = 0;
//			for(int i=0; i<b.length; i++) {
//				if(b[i] % 2 != 0) {
//					sum += b[i];
//				}
//			}
//			System.out.println(sum);
//		int sum3 = 0;
//		int sum5 = 0;
//		int sum35 = 0;
//		int sum = 0;
//		for (int i = 0; i < b.length; i++) {
//			if (b[i] % 15 == 0) {
//				sum35 += b[i];
//			}
//			if (b[i] % 3 == 0) {
//				sum3 += b[i];
//			}
//			if (b[i] % 5 == 0) {
//				sum5 += b[i];
//			}
//			if (b[i] % 5 != 0 && b[i] % 3 != 0) {
//				sum += b[i];
//			}
//		}
//		System.out.println("3과 5의 배수의 합 : " + sum35);
//		System.out.println("3의 배수의 합 : " + sum3);
//		System.out.println("5의 배수의 합 : " + sum5);
//		System.out.println("둘 다 아닌 값의 합 : " + sum);
		
		int[] c = {2, 5, 6, 8, 9};
//		for(int i=1; i<c.length; i++) {
//			c[0]+=c[i];	
//		}
//		System.out.println(c[0]);

		
//		for(int i = 0; i < c.length; i++) {
//			if(i != c.length - 1) {
//				c[i]= c[i+1];
//			}else {
//				c[i] = t;
//			}
//			System.out.print(c[i]+",");
//		}
		int t = c[0];
		for(int i=1; i<c.length; i++) {
			c[i-1] = c[i];
			if(i==c.length-1) {
				c[i] = t;
			}
		}
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		
	}

}
