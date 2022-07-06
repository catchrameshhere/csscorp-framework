package basic;

public class GlobalVariableInstanceVariable {

	//Global scoped variable
	//instance variable or non static variable

	String name;

	public void welcomeMessage() {
		System.out.println("Hello Mr./Mrs. " + name);
	}


	public static void main(String[] args) {

		GlobalVariableInstanceVariable obj1 = new GlobalVariableInstanceVariable();
		obj1.name = "Rambo";
		obj1.welcomeMessage();


		GlobalVariableInstanceVariable obj2 = new GlobalVariableInstanceVariable();
		obj2.name = "Deepa";
		obj2.welcomeMessage();

		obj1.welcomeMessage();

	}

}
