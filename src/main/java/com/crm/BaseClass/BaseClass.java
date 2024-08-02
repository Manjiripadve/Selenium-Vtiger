package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.JavaUtility.JavaUtility;
import com.crm.Pom.WebElements;

public class BaseClass {
	public static WebDriver driver;
	
    
	public void preCondition() throws IOException
	{
		String browser = JavaUtility.logindata("browser");
		String url = JavaUtility.logindata("url");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	public void login() throws IOException
	{
		WebElements w=new WebElements(driver);
		String username = JavaUtility.logindata("username");
		String pass=JavaUtility.logindata("pass");
		w.user_name.sendKeys(username);
		w.pass.sendKeys(pass);
		w.login.click();
		
	}
	
	
	public void logout()
	{
		WebElements w=new WebElements(driver);
		w.profile.click();
		w.logout.click();
	}
	
	public void postCondition()
	{
		driver.quit();
	}
	
	

}
