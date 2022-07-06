package basic;

public class Test {

	public void m1(){
		Student s1 = new Student();//object creation
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();//object creation
		GlobalVariableStaticVariable obj = new GlobalVariableStaticVariable();
		System.out.println(obj.currentYear);
		System.out.println(currentYear);
		
		System.out.println(GlobalVariableStaticVariable.currentYear);
	}
}
