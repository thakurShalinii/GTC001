package seleniumBasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteScreenshot {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
		        try {
		        	 driver.get("https://www.instagram.com/"); 
		            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		            Path destination = Paths.get("C:\\Users\\shalu\\eclipse-workspace\\GTC001\\Screenshot\\img5.png");
		            Files.write(destination, screenshotBytes);

		            System.out.println("Screenshot taken and saved successfully!");
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		        
		        }
		    }
		


	}


