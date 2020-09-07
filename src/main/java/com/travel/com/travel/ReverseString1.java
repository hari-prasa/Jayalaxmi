package com.travel.com.travel;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="I am a good programmer";
		int count=0;
		String arr[]=str.split(" ");//split method is using remove the spaces for exmaple"Iamagoodprogrammer",and arr[] means it will start "0" index,Each string value start 0 value l
	//Like 0=i,1=a,2=m,a=3etc...............
		for(int i=0;i<arr.length;i++){
			count=arr[i].length();
			for(int k=count-1;k>=0;k--){
			System.out.println(arr[i].charAt(k));
			if(k==0){
				System.out.println(" ");
				}
			
				
				String input="i am good programmer";
				//String output=" ";
				//for(String s:input.split(" "));
				//for (char string : ) {
					StringBuffer sb = new StringBuffer(input);
					//sb.append(input);
					sb.reverse().toString();
					System.out.println(sb);
				//}
			}
		}
		
		
		// TODO Auto-generated method stub

}

}
