package selenapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) throws InterruptedException {
		
		// https://chromedriver.storage.googleapis.com/index.html
		String baseURL = "https://www.google.com/";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.quit();

	}

}
 