package com.SundayRevision;


public class OverRidingDemo {
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.met();
		
		Parent1 parentObj=new Child1();
		parentObj.met();
		
	}
}
class Parent1{
	 int met() {
		 System.out.println("parent method called...");
		return 1;
	}
}
class Child1 extends Parent1{
	//if you want, we can over ride the parent method
	public int met() {
		System.out.println("child method called....");
		super.met();//super will refer the parent method
		return 1;
	}
	// rules for overriding are
	//1. The method name should be same
	//2. The parameters should be same
	//3. The return type should be same
	//4. The access specifier should be same or of higher visibility
}