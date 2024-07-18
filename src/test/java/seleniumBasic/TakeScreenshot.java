package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
    public static void main(String[]args) throws IOException{
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.instagram.com/");
     LocalDateTime ldt= LocalDateTime.now();
     DateTimeFormatter dtf= DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
     String s = ldt.format(dtf);
     TakesScreenshot ts= (TakesScreenshot)driver;
     File srcFile=ts.getScreenshotAs(OutputType.FILE);
     String path=".\\Screenshot\\"+s+".png";
     File targetFile=new File(path);
     FileUtils.copyFile(srcFile, targetFile); 
     
}
   

}


