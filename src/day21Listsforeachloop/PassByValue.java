package day21Listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	
	/*
	 *1)  If you use a variable inside a method java does not use the original 
	 *    variable inside the method java create the copy of the variable
	 *   to use the copy inside the method.
	 *   By using the copy, Java protects the original value from the method updates.
	 *   
	 *   This feature is called "Pass by value" in Java
	 *2)  If you insist to update original value, you can do it by assigning method return to the variable like:
	 *		a=increase(a);
	 */

	public static void main(String[] args) {
		/*
		 * For primitives, method call does not change the original value.
		 * If you want to change, original value you should do assignment like;
		 * a = increase(a); 
		 */
		
		int a = 10;
		System.out.println("Before method call: " + a); //10
		
		increase(a);
		System.out.println("After method call: "+ a); //10
		
		a=increase(a);
		System.out.println(a);// 30
		
		/*
		 * For immutable objects, method call does not change the original value like in primitives.
		 * If you want to change, original value you should do assignment like;
		 * s = putQuestionMark(s); 
		 */
		
		String s= "Are you tired";
		System.out.println("Before method call: "+s); //Before method call: Are you tired
		
		putQuestionMark(s);
		System.out.println("After method call: "+s);//After method call: Are you tired
		
		
		s=putQuestionMark(s);
		System.out.println("After pass the value: "+s);//After pass the value: Are you tired?

		/*
		 * For mutable objects Java copies the reference then use the copy of reference inside the method.
		 * Reference itself and copy of reference points the same object, because of that when you call a method
		 * for mutable objects, original value will be updated. 
		 */
		
		/*
		 * When you list methods, originals list will be updated.
		 * If you want to keep original list in your application, use "List.copyOf()" method.
		 * 
		 */
		List<String>list = new ArrayList<>();
		list.add("Hi");
		list.add("Wooow");
		list.add("Sorry");
		
		List<String>  list1 = List.copyOf(list);
		
		
		System.out.println("Before method call: "+list);
		
		
		
		putExclamationMark(list);
		System.out.println("After method call: "+list);
		
	}
	public static int increase(int x) {
		return x*3;
	}
	public static String putQuestionMark(String str) {
		return str+ "?";
	}
	public static List putExclamationMark(List<String>list) {
		for(int i = 0; i<list.size(); i++) {
			list.set(i, list.get(i)+ "!");
			}
		return list;
	}
}
