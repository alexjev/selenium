package selenapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtest {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver; WebElement element;
		
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("Poudii");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.id("text-container")).click();
		driver.findElement(By.id("video-title")).click();
		driver.findElement(By.className("ytp-svg-shadow"));
	}

}
