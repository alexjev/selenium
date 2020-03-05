package selenapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/stefan-selenium/chromedriver");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.abstract.rs");
		assertEquals(browser.getTitle(), "Abstract");
		browser.close();
	}

}
