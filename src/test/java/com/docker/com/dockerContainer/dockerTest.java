package com.docker.com.dockerContainer;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class dockerTest {
	
	@Test

	public void test1() throws MalformedURLException {
	
	//DesiredCapabilities ds = DesiredCapabilities.chrome();
		
		DesiredCapabilities ds = DesiredCapabilities.firefox();
	
	URL url = new URL("http://localhost:4444/wd/hub");
		
	RemoteWebDriver driver = new RemoteWebDriver(url,ds);
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
		
	String title = driver.getTitle();	
		
	System.out.println("Title name is :		" + title);
	
	driver.quit();
	
		
		
		
		
		
		
		
		

	}

}
