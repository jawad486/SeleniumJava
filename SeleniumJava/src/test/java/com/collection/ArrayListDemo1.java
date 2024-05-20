package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		/*
		 * // Declare ArrayList
		 * 
		 * // To declare ArrayList with homegenous data; // ArrayList <String> al=new
		 * ArrayList<String> (); // List al=new ArrayList();
		 * 
		 * ArrayList al = new ArrayList(); // type 1
		 * 
		 * //to add new objects to the arraylist al.add(100); al.add("welcome");
		 * al.add(34.6); al.add(true); al.add('j');
		 * 
		 * // to print all the value of the arrayList
		 * 
		 * System.out.println(al);
		 * 
		 * //to count how many object are present in arraylist
		 * System.out.println(al.size()); al.remove("welcome");
		 * 
		 * System.out.println(al); Object n=al.get(3); System.out.println(n);
		 * 
		 * al.add(1, "welcomeBack"); System.out.println(al);
		 */
		
		List  myList =new ArrayList();
		
	myList.add(10);
	myList.add(9);	
	myList.add(8);
	myList.add(5);	
	myList.add(4);
	myList.add(12);
	myList.add(11);
	myList.add(7);
	
	  Collections.sort(myList);
	  System.out.println(myList);
	 // Collections.sort(myList,Collections.reverseOrder());
	 // System.out.println(myList);
	  Collections.reverse(myList);
	  System.out.println(myList); 
		
		
		

	}

}
