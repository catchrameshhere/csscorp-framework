package basic;

public class DecisionMakingExample {

	public void ifExample(int a) {

		System.out.println("number provided = " + a);

		if(a%2==0)
			System.out.println("its a even number");

		System.out.println("done");

	}

	public void ifElseExample(int a) {

		System.out.println("number provided = " + a);

		if(a%2==0)
			System.out.println("its a even number");
		else
			System.out.println("its an odd number");

		System.out.println("done");

	}

	public void elseIfElseExample(int a) {

		System.out.println("number provided = " + a);

		if(a==0)
			System.out.println("its neither a even number nor odd number");
		else if(a%2==0)
			System.out.println("its a even number");
		else
			System.out.println("its an odd number");

		System.out.println("done");

	}

	public void nestedIfElseExample(int a) {

		System.out.println("number provided = " + a);


		if(a<0)
			System.out.println("its a negative number");
		else {
			if(a==0)
				System.out.println("its neither a even number nor odd number");
			else if(a%2==0)
				System.out.println("its a even number");
			else
				System.out.println("its an odd number");
			
		}

		System.out.println("done");

	}
	
	
	public void switchCaseExample(String day) {
		switch (day) {
		case "mon":
			System.out.println("its monday blues");
//			break;
		
		case "tue":
			System.out.println("its tuesday");
//			break;
			
		case "wed":
			System.out.println("watchout for online deals");
			break;
			
		case "thu":
			System.out.println("its not friday yet");
			break;
			
		case "fri":
			System.out.println("TGIF!!!");
			break;
			
		case "sat":
			System.out.println("YAYYY!!!!! Finally the weekend is here");
			break;
			
		case "sun":
			System.out.println("Oh No!! tomorrow is monday");
			break;

		default:
			System.out.println("please provide a valid day");
			break;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		DecisionMakingExample obj = new DecisionMakingExample();
		//		obj.ifExample(3);
		//		obj.ifElseExample(0);
//		obj.elseIfElseExample(-12);
//		obj.nestedIfElseExample(6);
		obj.switchCaseExample("tue");

	}

}











