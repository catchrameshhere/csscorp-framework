package oops;

class GrandFather{
	public void car() {
		System.out.println("grandfather's car - maruti 800" );
	}
}

class Father {
	public void bike() {
		System.out.println("father's bike - Hero Honda Splendor");
	}
}


class Son extends Father{
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.bike();
//		s1.car();
		


	}

}
