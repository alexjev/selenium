package selenapp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	WebDriver driver;
	private JavascriptExecutor js;
	String baseUrl1;
	String baseUrl2;


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		baseUrl1 = "http://letskodeit.teachable.com/pages/practice";
		baseUrl2 = "http://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
    driver.get(baseUrl1);
		
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0, -190);");
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on show button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
	}
	
	@Test
	public void testExpedia() throws InterruptedException {
		driver.get(baseUrl2);
		
		WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
		System.out.println("Child Drpdown Displayed: " + childDropdown.isDisplayed());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
