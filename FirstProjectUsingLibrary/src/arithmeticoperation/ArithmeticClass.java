package arithmeticoperation;

public class ArithmeticClass {
	double a;
	double b;
	double result;
	
	public void addition(double a,double b) {
		result = a + b;
		System.out.println("Sum of given number is:"+result);
		
	}
	public void substraction(double a,double b) {
		result = a - b;
		System.out.println("substraction of given number is::"+result);
		
	}
	public void multiplication(double a,double b) {
		result = a * b;
		System.out.println("multiplication of given number is::"+result);
		
	}
	public void division(double a,double b) {
		result = a/b;
		System.out.println("Division of given number is::"+result);
		
	}

}

