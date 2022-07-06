package basic;

public class ConstructorExample {
	
	/*
	 * Constructor is a spl method
	 * one can choose to implement it or ignore it
	 * setup activities
	 * constructors does not have return type
	 * method gets called when objects are created
	 * same name as class name
	 * Constructors should not be used for return type kind of programming
	 * Parameterization for constructors is possible
	 * Constructors can be over loaded
	 */
	
	public ConstructorExample() {
		System.out.println("from constructor");
		
	}
	
	
	public ConstructorExample(String name) {
		System.out.println("from constructor");
		
	}
	
	public void testMethod() {
		System.out.println("from test method");
	}

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample("John");
		

//		obj.testMethod();
		
		
		
		
				
		System.out.println("done");

	}

}
