package oops;

class Mother{
	public void bike() {
		System.out.println("mom's bike = Activa");
	}
}

class Daugther extends Mother{
	@Override
	public void bike() {
		System.out.println("daughter's bike - ather");
	}
}

public class PolymorphismMethodOverridingExample {

	public static void main(String[] args) {
		Daugther d = new Daugther();
		d.bike();
	}

}
