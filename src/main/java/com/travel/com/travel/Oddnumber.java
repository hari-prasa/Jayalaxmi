package com.travel.com.travel;

import java.util.Arrays;
import java.util.TreeSet;

public class Oddnumber {

	public static void main(String[] args) {
		
				
		Object [] obj={21,23,54,98};
		for(Object number:obj){
			System.out.println("number="+number);
			
		}
		Arrays.sort(obj,1,3);
		for (Object number:obj){
			System.out.println(number);
		}
		
		
		
		
	}
		
}
