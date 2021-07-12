package com.CollectionInJava;

import java.util.StringTokenizer;

public class LinearDataStructureOneToMany {
	public static void main(String[] args) {
		
		String str ="aaa,bbb,cccc";
		 
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}

