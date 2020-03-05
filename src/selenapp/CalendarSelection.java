package selenapp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelection {
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "http://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.id("package-departing-hp-package")).click();
		WebElement departingField = driver.findElement(By.id("package-returning-hp-package"));
		departingField.click();
		Thread.sleep(3000);
		WebElement dateToSelect = driver.findElement(By.xpath("//*[@id=\"package-returning-wrapper-hp-package\"]/div/div/div[3]/table/tbody/tr[4]/td[5]/button"));
		dateToSelect.click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
