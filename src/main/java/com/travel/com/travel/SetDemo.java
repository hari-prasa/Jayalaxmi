package com.travel.com.travel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<>();
		set.add("jaya");
		set.add("Aanvi");
		set.add("jaya");
		set.add("MAdhu");
		set.add("jaya");
		set.add("Ayush");
		System.out.println(set);
Iterator<String>itr=set.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
	System.out.println(itr.next());

}

		
		// TODO Auto-generated method stub

	}

}
