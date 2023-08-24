package day04;

import java.util.Scanner;

public class Ex07_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*31)+1; //1~31까지 랜덤숫자
		int tr = 1;
				System.out.println(answer);
		
		while(true) {
			System.out.println("=====Up & Down=====");
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			
			if(num < answer) { 
				tr+=1;
				if(tr>5) {
					System.out.println("5회 초과 실패");
					break;
				}System.out.println("Up");
			}else if(num > answer) {
				tr+=1;
				if(tr>5) {
					System.out.println("5회 초과 실패");
					break;
				}System.out.println("Down");
					
			}else if(num == answer) {
				if(tr==1) {
					System.out.println("Perfect");
					break;
				}else if(tr>0) {
					System.out.println("정답");
					System.out.println("시도"+tr+"회");
					break;
				}
				
			}
			System.out.println();
		}
		System.out.println("게임 종료");
	}

}
