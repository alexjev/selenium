package selenapp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class JUnitTesting {	
	
	WebDriver driver;
	String baseUrl;
    
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/abstract/Desktop/Selenium/geckodriver");
		driver = new FirefoxDriver();
    	baseUrl = "https://www.google.com/";
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	void test() {
		driver.get(baseUrl);
	}
	
	@After
	void tearDown() throws Exception {
	}
}
