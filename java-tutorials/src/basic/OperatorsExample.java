package basic;

public class OperatorsExample {
	
	public void operatorsDemo() {
		
		//arithmetic operation
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
		
//		a = a + 1;
//		a++;
		
		
//		a = a - 1;
//		a--;
//		System.out.println(a);
		
		
		//Relational Operation ==> result is boolean
//		int a = 10;
//		System.out.println(a==10);
		
		
		//logical
//		int a = 5;
//		
//		boolean result = (a<10 && a>0);
//		System.out.println(result);
		
		//assignment
		int a = 10;
		
//		a = a + 5;
		a += 6;
		
		System.out.println(a);
		
		
	}
	
	public void misOperation() {
		//ternary or conditional operator
		
//		int a = 16;
//		
//		int b = (a<10) ? 3 : 7;
//		
//		System.out.println(b);
	
		//instance of
		String name = "Dan";
		System.out.println(name instanceof String);
		
	}
	
	public void precedenceExample() {
		int a = 10;
		
//		a++;
//		++a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		OperatorsExample obj = new OperatorsExample();
//		obj.operatorsDemo();
//		obj.misOperation();
		
//		System.out.println(obj instanceof OperatorsExample);
		
		obj.precedenceExample();

	}

}















