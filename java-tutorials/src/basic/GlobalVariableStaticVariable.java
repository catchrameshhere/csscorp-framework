package basic;

public class GlobalVariableStaticVariable {
	
	//Global scoped variable 
	//static variable or class variable
	
	static int currentYear = 2022;
	
	
	public void printYear() {
		currentYear = 2023;
		System.out.println("printyear - current year value = " + currentYear);
	}
	
	
	public void m1() {
		System.out.println("m1 - current year value = " + currentYear);
	}
	
	public static void m2() {
		System.out.println(currentYear);
	}

	public static void main(String[] args) {
		GlobalVariableStaticVariable obj = new GlobalVariableStaticVariable();
		obj.m1();
		obj.printYear();
		obj.m1();
		
		System.out.println(currentYear);
		System.out.println(obj.currentYear);//should not be access this way
		
		System.out.println(GlobalVariableStaticVariable.currentYear);

	}

}










