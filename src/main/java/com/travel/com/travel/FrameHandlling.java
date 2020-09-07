package com.travel.com.travel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");

        WebDriver dr1= new ChromeDriver(); ;

        dr1.get("http://testautomationpractice.blogspot.com/");
        dr1.switchTo().frame("frame-one1434677811");
        Thread.sleep(5000);
        dr1.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("jaya");
        Thread.sleep(3000);
        dr1.switchTo().parentFrame();
        List <WebElement> lst=dr1.findElements(By.tagName("iframe"));
        System.out.println(lst);
        Thread.sleep(2000);
       List<WebElement>lst1=dr1.findElements(By.tagName("a"));
       for (int i=0;i<lst1.size();i++){
    	   System.out.println(lst1.get(i).getText());
       }
	}

}
