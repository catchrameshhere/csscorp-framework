package p2;

import p1.A;

public class C {
	public void m1() {
		A obj = new A();
		System.out.println(obj.v1);//error
		System.out.println(obj.v2);//error
		System.out.println(obj.v3);//error
		System.out.println(obj.v4);
	}
}
