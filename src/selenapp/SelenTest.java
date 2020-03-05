package selenapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SelenTest {
	
	private static WebDriver browser;
	
	@BeforeAll
	static void hello() {
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/stefan-selenium/chromedriver");
		browser = new ChromeDriver();
	}

	@Test
	void test() {
	    browser.get("https://www.abstract.rs");
	    WebElement grid = browser.findElement(By.id("works-grid"));
	    assertTrue((grid.isDisplayed()));
	}
	
	@Test
	void checkTitleTest() {
	    browser.get("https://www.abstract.rs");
	    assertEquals(browser.getTitle(), "Abstract");
	}
	
	@AfterAll
	static void close() {
		browser.close();
	}

}
