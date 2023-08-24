package day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1;
		System.out.println(answer);
		int cnt = 0;
		int tr = 10;
		
		while(true) {
			System.out.println("=====up&down===== 시도가능 횟수 : "+(tr-cnt));
			System.out.print("1~31까지 숫자입력> ");
			int a = sc.nextInt();
			cnt++;
			
			System.out.println(answer);
			
			if(answer == a) {
				System.out.println("정답 시도횟수 : "+cnt);
				break;
			}else if(cnt == 10) {
				System.out.println("시도횟수 초과");
				break;
			}else if(answer > a) {
				System.out.println("up");
			}else if(answer < a) {
				System.out.println("down");
			}
			System.out.println();
		}
		System.out.println("게임 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
