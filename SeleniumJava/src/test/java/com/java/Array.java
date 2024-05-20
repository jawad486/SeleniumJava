package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Array {
	
	@Test(enabled=false)
	void declareArrayAndPrint() {
		
		//Array supporting class is Arrays;
		//Collections is the supporting class of collection
		
		int [] myArray= {12,45,67,22,12,44,80};
		System.out.println("my array is:" +Arrays.toString(myArray));//to print array we need Arrays class and the method toString
		System.out.println("total count:" +myArray.length); //to find total count  we use length 
		
		for (int i=0;i<=myArray.length;i++) {  //to find each element in the array  (if it is int the use <= and for string use < then 
			System.out.println(myArray[i]);
		}
		
	}
	@Test
		public static void changeArrayToList() {
			
		//convert array to list
			int [] arr1= {12,4,67,88,2,4,12,56,59,77};
		//	List <Integer> myList=Arrays.asList(arr1); if you use array Name in the parameter it will not work because collection does not handle Primitive data type
			
			
			//>>>> Remove the douplicate value from the list or array
			List <Integer> myList=Arrays.asList(12,4,67,88,2,4,12,56,59,77);
			System.out.println("Total account before removing duplicates:"+ myList.size());
			
			
			Set <Integer> mySet=new HashSet(myList);
			System.out.println("Duplicates are removed:" +mySet);
			System.out.println("Total count after removing the duplicates:" +mySet.size());
			
			
			
			
			
			
			
			
	
		
		
		
	}

}
