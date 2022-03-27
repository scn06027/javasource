package classtest;

public class CalculatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 cal =new Calculator3();

		cal.a=10;
		cal.b=5;
		
		System.out.println("a + b = "+Calculator3.add(10,5));
		System.out.println("a - b = "+Calculator3.subtract(10,5));
		System.out.println("a * b = "+Calculator3.multiply(10,5));
		System.out.println("a / b = "+Calculator3.divide(10,5));
	}

}
