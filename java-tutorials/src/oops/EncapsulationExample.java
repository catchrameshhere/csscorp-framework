package oops;

class Facebook{
	
	String username;
	private String password;
	
	public void validateCredentails() {
		System.out.println("username = " + username);
		System.out.println("password = " + password);
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
}



public class EncapsulationExample {

	public static void main(String[] args) {
		Facebook obj = new Facebook();
		obj.username = "dan@gmail.com";
//		obj.password = "test124";
		obj.setPassword("test1234");
		
		obj.validateCredentails();
		
		System.out.println("********Hacker***********");
		System.out.println("username = " + obj.username);
		System.out.println("password = " + obj.password);

	}

}
