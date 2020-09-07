package com.travel.com.travel;

public class Specialjunkchar {

	public static void main(String[] args) {
        int limit = 50;
        
        System.out.println("Printing Odd numbers between 1 and " + limit);
       
        for(int i=1; i <= limit; i++){
               
                //if the number is not divisible by 2 then it is odd
                if( i % 2 != 0){
                        System.out.print(i + " ");
                }
        }

		String s1="@#%$ohhbgykbCApgemini55454";
	 s1=	s1.replaceAll("[^a-zA-Z0-9]","");//regular expression
		// TODO Auto-generated method stub
		System.out.println(s1);

	}

}
