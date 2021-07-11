package com.CollectionInJava;


import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ColDemo3 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(10,5);
		
		list.add("hello");
		list.add("this");
		list.add("list");
		
		System.out.println(list);
		
//		list.ensureCapacity(0); used for capacity or can be used in vector constructor 
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list.contains("list"));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.isEmpty());
		Object s[] = list.toArray();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String ss : list) {
			System.out.println(ss);
		}
		// iterators in vector.
		Iterator<String> iter=list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println(iter.hasNext());
		
		ListIterator<String> listIter = list.listIterator();
		
		//list.add("new value"); you cannot add value in iterator it will through an error

		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
		
		while(listIter.hasPrevious()) {
			System.out.println(listIter.next());
		}
		
		Enumeration<String> en = list.elements();
		list.add("new value....3");
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
