package com.travel.com.travel;

public class Polymorphism {
	
public void add(int a,int b){
	System.out.println(a+b);
}
public void add(int a,int b, int c){
	System.out.println(a+b+c);
}
public void add(int a,int b,int c,int d){
	System.out.println(a+b+c+d);
}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
p.add(12, 9);
p.add(5, 9, 90);
		
		
		// TODO Auto-generated method stub

	}

}
