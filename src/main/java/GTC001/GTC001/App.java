package GTC001.GTC001;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
    public static void main( String[] args ) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	WebDriver d = null;
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	d.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	d.findElement(By.linkText("Selenium Practice")).click();
	Thread.sleep(1000);
	d.findElement(By.linkText("Dropdowns")).click();
	WebElement dd = d.findElement(By.id("course"));
	WebElement dd1 = d.findElement(By.id("ide"));
	Select sl = new Select(dd1);

	sl.selectByIndex(0);
	Thread.sleep(1000);
	sl.selectByIndex(1);
	Thread.sleep(1000);
	sl.selectByIndex(2);
	Thread.sleep(1000);
	sl.selectByIndex(3);
	Thread.sleep(1000);
	
	
	
	sl.selectByValue("ec");
	sl.selectByValue("ij");
	sl.selectByValue("vs");
	sl.selectByValue("nb");
	
	
	sl.selectByVisibleText("Eclipse");
	sl.selectByVisibleText("IntelliJ IDEA");
	sl.selectByVisibleText("NetBeans");
	sl.selectByVisibleText("Visual Studio");
	
	
	Thread.sleep(1000);
	
	List<WebElement> lst = sl.getOptions();
	System.out.println("Total size: " + lst.size());
	for (WebElement we : lst) {
		System.out.println(we.getText());
	}
	d.close();


	  
	
    
    }
}
