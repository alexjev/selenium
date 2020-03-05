package selenapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/home/abstract/Desktop/Selenium/geckodriver");
        driver = new FirefoxDriver();
        String baseURL = "https://www.google.com/";
        
        driver.get(baseURL);
	}

}
