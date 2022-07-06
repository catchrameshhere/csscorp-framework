package basic;

public class LocalVariable {
	
	public void m1() {
		int age = 34;//local variable
		
		System.out.println(age);
	}
	
	public void m2() {
		System.out.println(age);//error
	}
	
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.m1();
		System.out.println(age);
		System.out.println();
	}

}
