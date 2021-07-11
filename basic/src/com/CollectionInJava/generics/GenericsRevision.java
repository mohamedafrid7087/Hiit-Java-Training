package com.CollectionInJava.generics;

public class GenericsRevision {
	
public static void main(String[] args) {
	
	Child3<Ball> child3 = new Child3<>();
	
	child3.setObj(new Ball());
	child3.getObj().play();
	
	Child3<Sweet> childRamu = new Child3<>();
	
	childRamu.setObj(new Sweet());
	childRamu.getObj().eat();
	
}
}

class Ball{
	public void play() {
		System.out.println("playing with ball....");
	}
		
	
}


class Sweet{
	
	public void eat() {
		System.out.println("eating sweet......");
	}
	
}
// 1st approach
// association b/w child and items
class Child{
	Ball ball;
	public void action() {
		ball.play();
	}
	
}
// 2nd approach association is tightly coupled with ball.

class Child2{
	Object obj;
	public void action() {
		if(obj instanceof Ball) {
			Ball ball = (Ball)obj;
			ball.play();
		}
		else if(obj instanceof Sweet){
			Sweet sweet = (Sweet)obj;
			sweet.eat();
		}
	}
}

class Child3<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	
	public T getObj() {
		return this.obj;
	}
	
}
