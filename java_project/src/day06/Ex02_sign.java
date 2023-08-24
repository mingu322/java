package day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Ex02_sign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] date = new String[10];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		int cnt = 0;
		
		while(true) {
			System.out.println("=====마켓커리=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름 입력> ");
				name[cnt] = sc.next(); 
				System.out.print("아이디 입력> ");
				id[cnt] = sc.next();
				System.out.print("비밀번호 입력> ");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now(); //현재날짜시간 구하는것
				date[cnt] = dtf.format(now);
 				
				
				System.out.println("회원가입 성공");
				cnt++;
			}else if(menu == 2) {
				System.out.print("아이디> ");
				String loginId = sc.next();
				System.out.print("비밀번호> ");
				String loginPw = sc.next();
				boolean find = false;
				
				for(int i=0; i<cnt; i++) {
					if(loginId.equals(id[i])) {
						if(loginPw.equals(pw[i])) {
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("비밀번호가 틀렸습니다");
						}
						
					}	
				}if(!find) {
					System.out.println("아이디가 틀렸습니다");
				}
			}else if(menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\n");
				System.out.println("===========================");
				for(int i=0; i<cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n",name[i], id[i], pw[i], date[i]);
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
	}
}
