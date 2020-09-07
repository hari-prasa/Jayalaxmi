package com.travel.com.travel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver dr1=new ChromeDriver();
		dr1.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
dr1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
Set <String>set=dr1.getWindowHandles();
Iterator<String>itr=set.iterator();
String parentwinid=itr.next();
String childwinid=itr.next();
dr1.switchTo().window(parentwinid);
dr1.switchTo().window(childwinid);
dr1.switchTo().defaultContent();
Alert alt=dr1.switchTo().alert();
alt.accept();
alt.getText();





	}

}
