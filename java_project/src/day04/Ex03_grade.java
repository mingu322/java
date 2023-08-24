package day04;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========성적표=======");
			System.out.print("국어> ");
			int kor = sc.nextInt();
			System.out.print("영어> ");
			int eng = sc.nextInt();
			System.out.print("수학> ");
			int mat = sc.nextInt();
			int sum = kor+eng+mat;
			int avg = sum/3;
			String ade = "";
			
			if(avg >= 90) {
				ade = "A";
			}else if(avg >= 80) {
				ade = "B";
			}else if(avg >= 70) {
				ade = "C";
			}else if(avg >= 60) {
				ade = "D";
			}else {
				ade = "F";
			}
			
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("============================================");
			System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+avg+"\t"+ade);
			
		}
	}

}
