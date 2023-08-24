package day11;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		cal.num1 = 5;
		
		cal.num2 = 4;
//		int a = 1;
		cal.sum();
		System.out.println(cal.sub(4, 10));
		cal.mul();
		System.out.println(cal.div(10, 2));
				
	}

}
