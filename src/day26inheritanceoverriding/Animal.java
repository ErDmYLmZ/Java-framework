package day26inheritanceoverriding;

public class Animal {
	
	String name = "Animal";
	int height = 33;
	protected byte ageOfAnimal = 3;
	
	public Animal() {
		System.out.println("Parent constructor ran...");
	}
	
	public Animal(String name) {
		this();
		System.out.println("Parent constructor with parameters ran...");
	}

	public void move() {
		System.out.println("Animals move..");
	}
	
	public void eat() {
		System.out.println("Animals eat..");
	}
	
	
	
	
	
	
	
}
//screenshots ==>   super() vs this()
	//					IS A and HAS A Method
	//					Constructor call
	//					grandparent to parent to child class.
    //					variables menu for object
	//					super() vs super
	//					"this." explanation
	