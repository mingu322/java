package day02;

public class 반복문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<10; i++) {
//			System.out.println(i);
//			if(i == 4) {
//				break;
//			}
//		}
		
//		for(int i=1; i<=10; i++) {
//			
//			if(i == 4) {
//				continue; 
//			}
//			System.out.println(i);
//		}
		
		int dan = 7;
		for(int i=1; i<10; i++) {
			if(i%5==0) {
				continue;
			}if(i%9==0) {
			    continue;
			}if(dan % 7 == 0) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
