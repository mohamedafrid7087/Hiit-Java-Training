package com.SundayRevision;

public class InterfaceDemo {
	
}
/*
 * Interfaces contain all abstract methods
 * They support multiiple inheritance
 * interface with no methods is called marker interface - used for creating identity
 * interface with one method is called functional interface - used for implementing lambdas and Methodexpression and anonymous inner classes.
 * you cannot have a constructor in a interface
 *
*/
interface MyInter{
	//if I want i can have a method
	//by default the methods are abstract in nature..
	public void met();
}
class MyInterImpl implements MyInter2,MyInter3{ // supports multiple inheritance
	@Override
	public void met() {
		System.out.println("met implementation of myinter called....");
	}
	@Override
	public void met2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void met3() {
		// TODO Auto-generated method stub
		
	}
}
//interfaces can extend another interface....
interface MyInter2 extends MyInter{
	//no need to override the parent interface methods...
	public void met2();
}
//interface supports multiple inheritance
interface MyInter3{
	public void met3();
}