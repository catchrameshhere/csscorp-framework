package basic;

public class MethodExample {

	//method without parameters/arguments and without return type
	public void m1() {
		int a = 10;
		int b = 20;

		int c = a + b;

		System.out.println("result = " + c );

	}

	//method with parameters/arguments and without return type
	public void m2(int a, int b) {			

		int c = a + b;

		System.out.println("result = " + c );

	}

	//method with parameters/arguments and with return type
	public int m3(int a, int b) {			

		int c = a + b;

		return c;

	}

	//method without parameters/arguments and with return type
	public int m3() {			

		int currentYear = 2022;

		return currentYear;

	}


	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		//		obj.m1();

		//		obj.m2(25, 15);

//		int result = obj.m3(10, 5);
//		System.out.println("from main method, result = " + result);

		int cy = obj.m3();
		System.out.println("current year = " + cy);
		

		System.out.println("done");

	}

}
