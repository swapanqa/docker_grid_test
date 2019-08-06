package com.docker.com.dockerContainer;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerTest1 {
	
	@Test

	public void test2() throws MalformedURLException {
	
	//DesiredCapabilities ds = DesiredCapabilities.chrome();
		
		DesiredCapabilities ds = DesiredCapabilities.chrome();
	
	URL url = new URL("http://localhost:4444/wd/hub");
		
	RemoteWebDriver driver = new RemoteWebDriver(url,ds);
	
	driver.get("https://www.google.com");
		
	String title = driver.getTitle();	
		
	System.out.println("Title name is :		" + title);
	
	driver.quit();
	
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	

}
