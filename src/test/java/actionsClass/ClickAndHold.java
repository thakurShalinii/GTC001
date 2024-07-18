package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriverManager .chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/dropable");
		 Actions act=new Actions(driver);
		 WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(frame);
		 Thread.sleep(1000);
		 WebElement source=driver.findElement(By.id("draggable"));
		 WebElement target=driver.findElement(By.id("droppable"));
		 act.dragAndDrop(source, target).release().build().perform();
		 
	}

}
