package com.CollectionInJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollDemo2 {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("my");
		list.add("name");
		list.add("mohamed");
		list.add("Afrid");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("the sorted list is"+ list);
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("haiii"));
		System.out.println(",.......");
		
	System.out.println(list.isEmpty());
	
		ListIterator<String> listItr = list.listIterator();
	
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.next());
		}
	}

}
