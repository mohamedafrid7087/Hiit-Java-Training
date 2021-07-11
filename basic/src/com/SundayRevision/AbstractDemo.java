package com.SundayRevision;

public class AbstractDemo {
	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.met();
		obj.met2();
		obj.met3();
	}
}
abstract class MyAbstract{
	public MyAbstract() {
		System.out.println("my abstract class cons called...");
	}
	public abstract void met();//abstract methods don't have body...
	//they should be compulsorily implemented/overriden in child class....
	
	public abstract void met2();
	
	//abstract classes can have non abstract methods
	//non abstract methods need not be overriden...
	public void met3() {
		System.out.println("met 3.............. called.............");
	}
}
class AbstractChild extends MyAbstract{
	public AbstractChild() {
		System.out.println("my abstract child class cons called....");
	}
	@Override
	public void met() {
		System.out.println("met method of child called...");
	}
	@Override
	public void met2() {
		System.out.println("met2222222222222222 method of child called.......");
	}
}
/*
 * abstract classes object cannot be created..
 * can have both abstract and non abstract methods
 * can have constructor
 * can have properties
 * the rules of inheritance are applied in abstract classes also
 * only one abstract class can be inherited in child - multiple inheritance not supported by java...
*/