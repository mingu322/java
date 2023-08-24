package day11;

public class Calculator {
	int num1;
	int num2;
	
	public void sum() {
		System.out.println(num1+num2);
	}
	
	public int sub(int a, int b) {
		if(a<b) {
			return b-a;
		}else {
			return a-b;	
		}
	}
	
	public void mul() {
		System.out.println(num1*num2);
	}
	public double div(int a, int b) {
		return a/(double)b;
	}
}
