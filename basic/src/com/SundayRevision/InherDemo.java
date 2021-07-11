package com.SundayRevision;

public class InherDemo {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.met();
	}
}
// inheritance creates a kind of relationship
// inheritance allows the child to use all method and properties of the parent class except which are declared private
class Parent{
	public void met() {
		System.out.println("parent method called....");
	}
}
class Child extends Parent{// extends creates inheritance between the parent and child
	
}