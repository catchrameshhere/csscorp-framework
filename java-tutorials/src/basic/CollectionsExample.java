package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionsExample {
	
	public void arrayExample() {
//		String name = "dan";		
//		System.out.println(name);
		
		String[] names = {"dan", "elaine", "obama", "john"};
		
//		System.out.println(names[3]);
//		for(int i=0; i<3; i++ ) {
//			System.out.println(names[i]);
//		}
		
//		for(int i=0; i<names.length; i++ ) {
//			System.out.println(names[i]);
//		}
		
		for (String str : names) {
			System.out.println(str);
		}
		
		
	}

	public void setExample(){
		
		/*
		//SLL
		HashSet<String> names = new HashSet<>();
		names.add("dan");
		names.add("elaine");
		names.add("albert");
		
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		*/
		
		//DLL
		LinkedHashSet<String> names = new LinkedHashSet<>();
		names.add("dan");
		names.add("elaine");
		names.add("albert");
		
		
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}
	
	public void listExample() {
		/*
		//SLL
		ArrayList<String> names = new ArrayList<>();
		names.add("dan");
		names.add("elaine");
		names.add("albert");
		
		System.out.println(names);
//		System.out.println(names.get(1));
		
		names.add(1, "obama");
		System.out.println(names);
		names.add(0, "john");
		System.out.println(names);
		*/
		
		//DLL
		LinkedList<String> names = new LinkedList<>();
		names.add("dan");
		names.add("elaine");
		names.add("albert");
		
		System.out.println(names);
//		System.out.println(names.get(1));
		
		names.add(1, "obama");
		System.out.println(names);
		names.add(0, "john");
		System.out.println(names);
		
		names.addFirst("Ramesh");
		names.addLast("suresh");
		System.out.println(names);
		
	}
	
	public void mapExample() {
		/*
		//SLL
		HashMap<String, String> john = new HashMap<>();
		john.put("fn", "John");
		john.put("ln", "Rambo");
		john.put("mobile", "123456");
		john.put("email", "john@gmail.com");
		
		System.out.println(john);
		System.out.println(john.get("mobile"));
		*/
		
		//DLL
		LinkedHashMap<String, String> john = new LinkedHashMap<>();
		john.put("fn", "John");
		john.put("ln", "Rambo");
		john.put("mobile", "123456");
		john.put("email", "john@gmail.com");
		
		System.out.println(john);
		System.out.println(john.get("mobile"));
		
		
	}
	
	
	public static void main(String[] args) {
		CollectionsExample obj = new CollectionsExample();
//		obj.arrayExample();
//		obj.setExample();
//		obj.listExample();
		obj.mapExample();

	}

}




