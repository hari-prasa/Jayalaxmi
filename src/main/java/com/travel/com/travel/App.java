package com.travel.com.travel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	
    			
    		
    	
    	
   
    	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");

        WebDriver dr1= new ChromeDriver(); ;

        dr1.get("http://www.google.com/");
        System.out.println( "Hello World!" );
        
       
    }
}