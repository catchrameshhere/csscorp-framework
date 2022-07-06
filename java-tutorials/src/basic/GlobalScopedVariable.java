package basic;

public class GlobalScopedVariable {
	
	int age = 34;
	
	public void m1() {
		System.out.println(age);
	}
	
	public void m2() {
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		System.out.println(age);//error

	}

}
