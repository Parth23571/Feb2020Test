package com.stc.Feb2020.com.stc.Feb2020.sp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//adding comments for testing
public class InvokeApp {
  @Test
  public void f() {
	  try
	  {
		  
		  WebDriverManager.chromedriver().setup();;
		  
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.google.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
		  driver.findElement(By.name("q")).sendKeys("testing");
		  driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		  
		  driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		System.out.println("Clicked - DONE");
		 
		 
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
}
