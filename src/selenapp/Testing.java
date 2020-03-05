package selenapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; WebElement element;
		
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ajjevdjenovic@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("septembar");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}


