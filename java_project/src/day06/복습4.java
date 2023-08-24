package day06;

public class 복습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {12, 3, 4, 5, 34};
//		
//		for(int i=0; i<a.length; i++) {
//			if(i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.println(a[i]+",");
//		}
		
//		int[] b = new int[10];
//		b[3] = 5;
//		for(int i=0; i<b.length; i++) {
//			b[i] = i+1;
//		}
//		for(int i=0; i<b.length; i++) {
//			System.out.print(b[i]+",");
//		}
		
//		int[] c = {12, 3, 5, 2, 15};
//		int sum = 0;
//		for(int i=0; i<c.length; i++) {
//			sum += c[i];
//		}
//		System.out.println(sum);
		
//		int[] d = {12, 3, 2, 24, 42};
//		
//		for(int i=1; i<d.length; i++) {
//			d[0] += d[i];
//		}
//		System.out.println(d[0]);
		
		int[] e = {12, 3, 2, 24, 42};
		int t = e[0];
		
		for(int i=1; i<e.length; i++) {
			e[i-1] = e[i];
			if(i==e.length-1) {
				e[i] = t;
			}
		}
		System.out.print(e[0]+",");
		System.out.print(e[1]+",");
		System.out.print(e[2]+",");
		System.out.print(e[3]+",");
		System.out.print(e[4]);
	
	
	
	
	
	}

}
