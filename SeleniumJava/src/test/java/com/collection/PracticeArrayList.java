package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeArrayList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(1);
		l.add("z");
		l.add("com.google");
		l.add('j');
		l.add(40);
		l.add(22);

		// to print list
		System.out.println(l);

		// total count of object
		System.out.println(l.size());

		System.out.println(l.contains("com.google"));

		// replace com.google to amzaon
		l.set(2, "Amazon");
		System.out.println(l);
		
		l.set(0, 20);
		System.out.println(l);
		
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	

	}

}
