package selenapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GigatronTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; WebElement element;
		
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.gigatron.rs/");
		driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[5]/header/div/div[5]/div/ul/li[4]/a")).click();
		driver.findElement(By.id("loginEmail")).sendKeys("dfawrfewqfew");
		
		// Thread.sleep(3000);

	}

}
