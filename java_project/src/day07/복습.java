package day07;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		System.out.print("아이디 입력> ");
//		String loginId = sc.next();
//		System.out.print("비밀번호 입력> ");
//		String loginPw = sc.next();
//		
//		if(loginId.equals(id) && loginPw.equals(pw)) {
//			System.out.println("로그인 성공");
//		}else if(!(loginId.equals(id)) && loginPw.equals(pw)) {
//			System.out.println("아이디가 틀렸습니다");
//		}else if(loginId.equals(id) && !(loginPw.equals(pw))) {
//			System.out.println("비밀번호가 틀렸습니다");
//		}else {
//			System.out.println("다시 입력하시오");
//		}
		
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();
//		int sum = 0;
//		
//		for(int i=0; i<=a; i++) {
//			sum += i;
//		}System.out.println(sum);
		
//		System.out.print("단 입력> ");
//		int dan = sc.nextInt();
//		
//		for(int i=1; i<20; i++) {
//			System.out.println(dan+" * "+i+" = "+(dan*i));
//		}
		
		for(int i=1; i<=100; i++) {
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
