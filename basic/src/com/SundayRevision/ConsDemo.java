package com.SundayRevision;


public class ConsDemo {
	public static void main(String[] args) {
		Bus obj=new Bus();
		
	}
}
class FourWheel{
	public FourWheel(int i) {
		System.out.println("default cons of four wheel called....");
	}
}
class Bus extends FourWheel{
	public Bus() {
		super(10);//non default constructor should be called explicitly. and super should be first line in the constructor
		System.out.println("default cons of bus called.....");
	}	
}