package com.travel.com.travel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logingmail {
	
	public static void  validUsernamepassword(String username,String password) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");

        WebDriver dr1= new ChromeDriver(); ;

	dr1.get("https://accounts.google.com/signin/v2/challenge/pwd?hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&cid=3&navigationDirection=forward&TL=AM3QAYZznKdI_-ZV8beVLUxNvqKZmNhj9nNhPZ93r0gj_lhBPPAyvpint1wfK0Q-");
	Thread.sleep(3000);
	dr1.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jayalaxmi.santi12");
	dr1.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	dr1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	dr1.findElement(By.xpath("//input[@name='password']")).sendKeys("Ayush@9862");
	
	}

	public static void main(String[] args)throws InterruptedException {
		Logingmail.validUsernamepassword("jayalaxmi.santi12"," Ayush@9862");
		// TODO Auto-generated method stub

	}

}
