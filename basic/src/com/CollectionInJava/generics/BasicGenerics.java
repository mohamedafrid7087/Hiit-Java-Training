package com.CollectionInJava.generics;


public class BasicGenerics {
	public static void main(String[] args) {
//		Ball obj=new Ball();
		Sky sky=new Sky();
		
		//Accept accept=new Accept();
		//accept.obj=sky;
		
		//accept.process();
		
		RightAccept<Balls> raccept=new RightAccept<>();
//		raccept.setT(sky);
		
		RightAccept<Sky> raccept2=new RightAccept<>();
		raccept2.setT(sky);
		
//		Ball ball=raccept.getT();
		
		Sky s=raccept2.getT();
		
	}
}
class Sky{
	
}
class Balls{
	public void meth() {
		System.out.println("this is dummy meth");
	}
}
class RightAccept<T>{
	T obj;
	public T getT() {
		return obj;
	}
	public void setT(T obj) {
		this.obj=obj;
	}
}
class Accept{
	Object obj;
	public void process() {
		if(obj instanceof Balls) {
			Balls ball=(Balls)obj;
			System.out.println(ball);
		}
		else if(obj instanceof Sky) {
			Sky sky=(Sky)obj;
			System.out.println(sky);
		}
	}
}