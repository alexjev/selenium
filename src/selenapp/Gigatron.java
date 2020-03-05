package selenapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gigatron {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver; WebElement element;
		
		System.setProperty("webdriver.chrome.driver", "/home/abstract/Desktop/Selenium/chromedriver");
		
		
		driver = new ChromeDriver();
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, 500);
		driver.get("https://www.gigatron.rs/");
		WebElement  x = driver.findElement(By.linkText("Proizvodi"));
		action.moveToElement(x).build().perform();
		Thread.sleep(1000);
		WebElement we = driver.findElement(By.linkText("Mobilni telefoni i oprema"));
		action.moveToElement(we).build().perform();
		Thread.sleep(1000);
		WebElement s = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[5]/div[3]/div/ul/li[1]/div/div/ul/li[6]/div/div[4]/h4[7]/a"));
		action.moveToElement(x).build().perform();
		driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[5]/div[3]/div/ul/li[1]/div/div/ul/li[6]/div/div[4]/h4[7]/a")).click();
	//	Thread.sleep(2000);   
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//*[@id=\"modernizrcom\"]/body/div[7]/div/div/div[3]/div[6]/div/ul/li[5]/figure/a/div"))).click();
	    Thread.sleep(1000); 
  //	    driver.findElement(By.xpath("//a[@href='https://www.gigatron.rs/pametni_satovi/honor_watch_magic-221103]")).click();
     //   WebElement sa = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[7]/div/div/div[3]/div[6]/div/ul/li[5]/figure/a"));
    //    action.moveToElement(x).build().perform();
  //    WebElement sa = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[7]/div/div/div[3]/div[6]/div/ul/li[4]/h4/a"));
  //    action.moveToElement(x).build().perform();
   //   driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[7]/div/div/div[3]/div[6]/div/ul/li[4]/h4/a")).click();
   //   Thread.sleep(1000);	    
  //    WebElement watch = driver.findElement(By.linkText("Uporedi"));
    //  action.moveToElement(x).build().perform();
   //   Thread.sleep(1000);
	    
	    
	}

}
