package com.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayPractice {

	public static void main(String[] args) {
		
		//declare a duplicate array
		
		String [] names= {"jawad","shahid","farhan","jawad","hassan"};
		
		// print array ===we use Arrays supporting class and method to String
		
    System.out.println(Arrays.toString(names));
    
    //find the total count  using length method
    
    System.out.println(names.length);
    
    // remove the duplicate value using list
    
           List <String> myList= Arrays.asList(names);
           
           //now convert list into set because list doesnot store duplicat value
           Set<String> mySet=new HashSet(myList);
           
           System.out.println(mySet.size());
           System.out.println(mySet);
           
           /////////////////////////////////////////////////////
           
			/*
			 * //to print all the options of the search box
			 * 
			 * driver.findElement(By.xpath("sccc")).sendKeys("jawad");
			 * 
			 * List<Webelemetn> options= driver.findElements(By.xpath("dff"));
			 * 
			 * 
			 * // count all the option sop(options.length)
			 * 
			 * 
			 * 
			 * for (int i=o;i<=options.size;i++) { sys(options.index{]i.getTest) }
			 */
    
		
		
		
	}

}
