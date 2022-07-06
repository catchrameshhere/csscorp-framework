package basic;

public class LoopingExample {


	public void whileLoopExample() {

		int a = 1;

		while(a<=10) {
			System.out.println("a = " + a);
//			break;
			a++;
		}
		
		System.out.println("done");

	}
	
	public void doWhileLoopExample() {

		int a = 25;

		do {
			System.out.println("a = " + a);
			a++;
		}while(a<=15);
		
		System.out.println("done");

	}
	
	public void forLoopExample() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}
	
	
	public void multiplicationTable(int n, int limit){
        for (int i=1;i<=limit;i++){
            System.out.println( n + " * " + i + " = " + (n*i)) ;
        }
    }


	public static void main(String[] args) {
		LoopingExample obj = new LoopingExample();
//		obj.whileLoopExample();
//		obj.doWhileLoopExample();
//		obj.forLoopExample();
		obj.multiplicationTable(6, 15);

	}

}
