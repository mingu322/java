package day05;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		char[] ade = new char[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====성적등록=====");
			System.out.println("1.성적등록 2.성적리스트 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름> ");
				name[cnt] = sc.next();
				System.out.print("국어> ");
				kor[cnt] = sc.nextInt();
				System.out.print("영어> ");
				eng[cnt] = sc.nextInt();
				System.out.print("수학> ");
				mat[cnt] = sc.nextInt();
				total[cnt] = kor[cnt]+eng[cnt]+mat[cnt];
				avg[cnt] = total[cnt] / (double)3;
				
				if(avg[cnt] >= 90) {
					ade[cnt] = 'A';
				}else if(avg[cnt] >= 80) {
					ade[cnt] = 'B';
				}else if(avg[cnt] >= 70) {
					ade[cnt] = 'C';
				}else if(avg[cnt] >= 60) {
					ade[cnt] = 'D';
				}else {
					ade[cnt] = 'F';
				}
				
				cnt++;
			}else if(menu == 2) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("====================================================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name[i], kor[i], eng[i], mat[i], total[i],avg[i], ade[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("0~2까지 입력가능");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
	}

}
