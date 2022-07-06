package oops;



abstract class Car{
	public abstract void carName();
	public abstract void manufacturer();
	public abstract void cost();
	public abstract void mileage();

	
	public void test() {
		System.out.println("from test method");
	}
	
}


class Nexon extends Car{

	@Override
	public void carName() {
		System.out.println("car name = Nexon");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("manufacturer = Tata");
		
	}

	@Override
	public void cost() {
		System.out.println("cost = INR 7.54 Lakhs onwards*");
		
	}

	@Override
	public void mileage() {
		System.out.println("mileage - 15KMPL");
		
	}
	
}

class Kiger extends Car{

	@Override
	public void carName() {
		System.out.println("car name = Kiger");
		
	}

	@Override
	public void manufacturer() {
		System.out.println("manufacturer = Renault");
		
	}

	@Override
	public void cost() {
		System.out.println("cost = INR 5.99 Lakhs onwards*");
		
	}

	@Override
	public void mileage() {
		System.out.println("mileage - 16KMPL");
		
	}
	
}



public class AbstractionExample {

	public static void main(String[] args) {
		Car c1 = new Kiger();
		c1.carName();
		c1.manufacturer();
		c1.mileage();
		c1.cost();

	}

}
