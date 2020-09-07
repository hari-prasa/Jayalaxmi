package com.travel.com.travel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String name[]={"java","ruby","python","c","java","ruby"};
		for(int i=0;i<name.length;i++){
		for (int j=i+1;j<name.length;j++){
			if (name[i]==name[j]){
				System.out.println(name[i]);
			}
		}
		}
	
		
		Set <String> store=new HashSet<String>();
		for(String nae:name){
			if(store.add(nae)==false){
				System.out.println(nae);
			}
		
		
			}
		}
	/*
	Map <String,Integer>sortedmap=ngoew HashMap<String,Integer>();
	
	for (String mn:name){
		Integer count=sortedmap.get(name);{
			if (count==null){
				sortedmap.put(mn, 1);
				
			}
			else{
				sortedmap.put(mn, count++);
				
			}
	
		
	}
	
	*/	
	//	Set<Entry<String,Integer>>entrySet=sortedmap.entrySet();
	//	for (<String,Integer>> entry:entrySet){
		//	if(entry.getvalue()>1){
		//		System.out.println("duplicate elements are "+entry.);
				
		//	}
		}
		
	
//	}

//}

