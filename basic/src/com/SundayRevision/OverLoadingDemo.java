package com.SundayRevision;


public class OverLoadingDemo {
	public static void main(String[] args) {
		Help911 helper=new Help911();
		helper.help(new Parent());// appropriate method is called using VMI/DMI
		//this property of vmi is called polymorphism
	}
}
//overloading leads one to polymorphism, because data changes behaviour changes.
class Help911{
	public void help(String s) {
		System.out.println("string help is called....");
	}
	
	public void help(int i) {
		System.out.println(" number help is called....");
	}
	
	public void help(float f) {
		System.out.println("float help is called.....");
	}
	
	public void help(Parent obj) {
		System.out.println("parent help is called.....");
	}
}
// java uses VMI (Virtual Method Invocation) to determine the method which it has to invoke... using the parameters passed.
//rules of overloading are
//1. The method name should be same
//2. The parameters should be different
//3. The return type can be changed.
//4. The access specifiers can be changed to any visibility