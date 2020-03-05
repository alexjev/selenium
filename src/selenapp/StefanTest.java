package selenapp;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class StefanTest {
	
	private static WebDriver driver;
	private static String baseUrl;

	@BeforeAll
	static void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/abstract/Desktop/Selenium/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		System.out.print("OKOKO");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

}
