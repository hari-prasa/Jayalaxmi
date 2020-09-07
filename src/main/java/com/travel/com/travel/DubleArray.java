package com.travel.com.travel;

public class DubleArray {

	
static String [][] data=new String[][]  {{"Dum","Dumer","Dumbest"}};


		
		static String[][] data1 = new String[][] {{"Dum","Dumer","Dumbest"}};

	    public static void main(String[] args) {

	        convertData(data);
	    }

	    public static void convertData(String[][]data) {
	        String[] toReturn = new String[data.length];
	        for(int i = 0;i<data.length;i++) {
	            for(int j = 0;j<3;j++){
	                toReturn[i] = data[i][j];
	            }
	        }
	        for(String s:toReturn) {
	            System.out.println(s);
	        }

	}

}
