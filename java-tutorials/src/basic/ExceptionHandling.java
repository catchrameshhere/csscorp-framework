package basic;

public class ExceptionHandling {

	public void divide(int a, int b) {

		try {
			int result = a / b;
			System.out.println("result = " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero is not mathematically supported");
		}

		catch (NullPointerException e) {
			System.out.println("please provide values for the variables");
		}
		
		catch (Exception e) {
			System.out.println("something went wrong while performing the divide operation");
		}
		
		finally {
			System.out.println("from finally block");
		}

		System.out.println("done with division");
	}


	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.divide(20, 0);
		System.out.println("main method - done");

	}

}
