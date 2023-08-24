package day02;

import java.util.Scanner;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++) {
//			System.out.println("안녕");
//		}
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
//		for(int i=0; i<10; i=i+2) {
//			System.out.println(i);
//		}
//		for(int i=3; i<=100; i++) {
//			System.out.println(i);
//		}
//		for(int i=0; i<=10; i++) {
//			System.out.print(i);
//		}
		
//		for(int i=0; i<=100; i=i+2) {
//			System.out.println(i);
//		}
//		for(int i=1; i<=100; i=i+2) {
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) {
//			System.out.print(i);
//			if(i != 10) {
//				System.out.print(",");
//			}
//		for(int i=1; i<=10; i++) {
//				if(i==10) {
//					System.out.print(i);
//				}else {
//					System.out.print(i+",");
//				}
//			}
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			sum=sum+i;	
//		}
//		System.out.println(sum);
		
//		int dan = 7;
//		
//		for(int i=1; i<20; i++) {
//			System.out.println(dan +" * "+ i +" = "+ (i*dan));
//		}
		
//		int cnt = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//				cnt++;	
//			}	
//		}
//		System.out.println(cnt);
		
		
//		int cnt1 = 0;
//		int cnt2 = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//				cnt1++;
//			}if(i % 5 == 0) {
//				cnt2++;
//			}
//		}System.out.println("3의 배수 : " +cnt1+"개");
//		 System.out.println("5의 배수 : " +cnt2+"개");
		
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("몇 부터> ");
//		 int a = sc.nextInt();
//		 System.out.print("몇 까지> ");
//		 int b = sc.nextInt();
//		 
//		 int sum = 0;
//		 for(int i=a; i<=b; i++) {
//			 sum = sum + i;
//		 }
//		 System.out.print(sum);
		 
		//피즈버즈
		// 입력받은 수 부터 입력받은 수 까지 출력하는데, 3의배수는 피즈 5의배수는 버즈 3,5의배수는 피즈버즈
		//예시)
		//1
		//2
		//피즈
		//4
		//버즈
		//피즈
		//7
		//8
		//피즈
		//버즈
		//11
		//피즈
		//13
		//14
		//피즈버즈
		//16
		//17
		//18
		Scanner sc = new Scanner(System.in);
		 System.out.print("몇 부터> ");
		 int a = sc.nextInt();
		 System.out.print("몇 까지> ");
		 int b = sc.nextInt();
		 
		 for(int i=a; i<=b; i++) {
			 if(i % 15 == 0) {
				 System.out.println("피즈버즈");
			 }else if(i % 3 == 0) {
				 System.out.println("피즈");
			 }else if(i % 5 == 0) {
				 System.out.println("버즈");
			 }else {
				 System.out.println(i);
			 }
		 }
			
		 
		 
		 
		 
		 
		 
	
	}	
}
