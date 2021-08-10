package day26inhertianceoverriding;

import day26inheritanceoverriding.Animal;

public class Mammal extends Animal {
	
	protected String name = "Mammal";
	protected int height= 22;
	protected byte ageOfMammal = 2;
	
	public Mammal (int height) {
		super();
		
		System.out.println(height + " cm.");
	}
	
	public void move() {
		System.out.println("Mammals move..");
	}
	public void feed() {
		System.out.println("Mammals feed their babies with milk..");
	}

}
//screenshots ==>   super() vs this()
	//					IS A and HAS A Method
	//					Constructor call
	//   				grandparent to parent to child class.
	//					variables menu for object
	//					super() vs super
	//					"this." explanation
