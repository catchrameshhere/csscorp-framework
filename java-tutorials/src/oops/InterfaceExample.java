package oops;


interface A{
	public abstract void carName();
	public abstract void manufacturer();
	public abstract void cost();
	public abstract void mileage();
	
	default public void test() {
		System.out.println("from test method");
	}
}

interface C{
	
}

interface D{
	
}

class B extends Car implements A, C, D {

	@Override
	public void carName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manufacturer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mileage() {
		// TODO Auto-generated method stub
		
	}
	
}





public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
