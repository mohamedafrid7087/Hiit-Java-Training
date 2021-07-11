package com.SundayRevision;

public class ObjectPassingDemo {
	public static void main(String[] args) {
		Room room=new Room();
		room.setItems("two bags by one person");
		
		PassByValue pbv=new PassByValue();
		
		PassByReference pbr=new PassByReference();
				
		System.out.println("Original value.....:"+room.getItems());
		//first experiment with pass by value
		pbv.accept(room.getItems());
		
		System.out.println("Output after pass by Value....");
		System.out.println(room.getItems());// since it is pass by value... no change happens to the room
		
		pbr.accept(room);
		System.out.println("Output after pass by reference....");
		System.out.println(room.getItems());// since it is pass by referene... changes do happen to the room
		
	}
}
class PassByValue {
	public void accept(String item) {//the method accept room items
		item="items changed.....";
	}
}
class PassByReference{
	public void accept(Room room) {//the method accept the room reference....
		room.setItems("items changed by pass by reference..................");
	}
}
class Room{
	private String items;
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
}
