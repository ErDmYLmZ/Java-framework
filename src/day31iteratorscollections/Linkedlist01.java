package day31iteratorscollections;

import java.util.LinkedList;

public class Linkedlist01 {

	public static void main(String[] args) {
		
		/*
		 * It is very similar to the list but the structure is completely different
		 * we call the member of linkedlist "Node"
		 * each node has two parts  1) data  2) pointer
		 * at the beginning of linkedlist there is a "Head" it does not have data part
		 * at the end of the linkedlist the pointer points to the null
		 */
		
		/*
		 * Assertion is quick and easy in linkedlist
		 * in assertion we just break the pointer and link the new node
		 * but for list we need to update indexes
		 */
		
		/*
		 * Deletion is also quick and easy with linkedlist
		 * we just broke the connection take the element
		 * indexes are updated by itself

		 */
		
		/*
		 * reaching an element is easy with list. 
		 * Because we can directly reach element by using index
		 * but it is too hard and takes time to reach a node in linkedlist.
		 * because it checks every nodes one by one
		 */
		
		LinkedList<String>ll1 = new LinkedList<String>();
		ll1.add("Samet");
		ll1.add("Huseyin");
		ll1.add("Muhammed");
		
		System.out.println(ll1);
		//add() comes from the List interface
		
		ll1.add(1,"Osman");
		
		System.out.println(ll1);
		
		ll1.addFirst("Ali Can");
		System.out.println(ll1);
		
		ll1.addLast("Veli Han");
		System.out.println(ll1);
		
		System.out.println(ll1.contains("Ali Can"));//true
		System.out.println(ll1.contains("Bob"));//false
		
		System.out.println(ll1.element());
		
		
		
		LinkedList<String>ll2 = new LinkedList<String>();
		System.out.println(ll2.element());
		//if our linkedlist is empty we need to handle it
		// otherwise it will throw an  exception "NoSuchElementException"
		
		

	}

}
