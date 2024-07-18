package seleniumBasic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		TakesScreenshot fs = (TakesScreenshot) driver;
		File srcFile = fs.getScreenshotAs(OutputType.FILE);
		String path = ("C:\\Users\\shalu\\eclipse-workspace\\GTC001\\Screenshot\\img6.png");
		File p1 = new File(path);
		FileUtils.copyFile(srcFile, p1);

	}

}
