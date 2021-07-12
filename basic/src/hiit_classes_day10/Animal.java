package hiit_classes_day10;

public class Animal {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
public static void main(String[] args) {
		
		Animal animal = new Animal("animal",1,1,5,5);
		
		Dog dog = new Dog("billa",8,20, 12, 4, 1, 20);
		dog.eat();
		
	}

	
	
	 public Animal(String name, int brain, int body, int size, int weight) {
		
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	 
	 public void move() {
		 
	 }
	 
	 public void eat() {
		 System.out.println("animal.eat called");
		 
	 }
	
}

class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int teeth;
	private int tail;

	public Dog(String name,  int size, int weight, int eyes, int legs, int teeth, int tail ) {
		super(name, 1, 1, size, weight);
		
		this.eyes=eyes;
		this.legs= legs;
		this.tail= tail;
		this.teeth = teeth;
		
	}
	
	
	private void chew() {
		System.out.println("Dog.chew called ");
		
	}


	@Override
	public void eat() {
		System.out.println("dog.eat called");
		chew();
		super.eat();
	}
}
