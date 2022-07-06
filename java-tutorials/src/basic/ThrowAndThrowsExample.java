package basic;

import java.io.FileNotFoundException;

public class ThrowAndThrowsExample{

	public void m1(int a, int b) throws ArithmeticException{

		int result = a / b;

		System.out.println("result = " + result);

		System.out.println("done with division");

	}

	public void m2(int a, int b) throws ArithmeticException, FileNotFoundException{
		try {
			int result = a / b;
			System.out.println("result = " + result);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("divide by zero not supported mathematically");
		}




		System.out.println("done with division");

	}


	public static void main(String[] args) {
		ThrowAndThrowsExample obj = new ThrowAndThrowsExample();
//		try {
//			obj.m1(20, 0);
//		}
//		catch (Exception e) {
//			//			System.out.println("divide by zero is not supported");
//			System.out.println(e.getMessage());
//		}
		
		try {
			obj.m2(20, 0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");

	}

}
