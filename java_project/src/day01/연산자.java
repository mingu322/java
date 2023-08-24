package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		// 산술연산자
		System.out.println(a + b); // 더하기
		System.out.println(a - b); // 빼기
		System.out.println(a * b); // 곱하기
		System.out.println(a / b); // 나누기(몫)
		System.out.println(a % b); // 나머지
		System.out.println("=====================");
		
		// 비교연산자
		System.out.println(a > b); //크다
		System.out.println(a < b); //작다
		System.out.println(a >= b); //크거나 같다
		System.out.println(a <= b); //작거나 같다
		System.out.println(a == b); //같은지
		System.out.println(a != b); //같지 않은지
		System.out.println("=====================");
		
		a = 10;
		b = 10;
		int c = 9;
		// 논리연산자 (&&(and), ||(or), !(not)
		System.out.println(a > c && b > c);
		System.out.println(a > c && c > b);
		System.out.println(a < c || a >= b);
		System.out.println(a != b || a == b);
		System.out.println(!(a > c));
		System.out.println(!(a > b && b > c ));
		System.out.println(a > b && !(b > c ));
		
		
	}

}
