package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(we).build().perform();
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		act.click(copy).build().perform();
		
		
		

	}

}
