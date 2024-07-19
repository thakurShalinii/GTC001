package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickActions2 {
	 public static void main( String[] args ) throws InterruptedException {
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			Actions act=new Actions(driver);
			WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		    act.moveToElement(fashion).build().perform();
		    Thread.sleep(1000);
	        WebElement Womenethnic =driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
	        Thread.sleep(1000);
	        act.moveToElement(Womenethnic).build().perform();
		    WebElement ethnicdresses=driver.findElement(By.xpath("//a[text()='Ethnic Dresses']"));
		    Thread.sleep(1000);
		    act.click(ethnicdresses).build().perform();
		    
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
  
}
