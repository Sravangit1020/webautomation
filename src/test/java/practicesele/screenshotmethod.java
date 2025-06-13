package practicesele;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotmethod {

	public static <TakesScreenShot> void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/notes/api/api-docs/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot takeshot = (TakesScreenshot) driver;
		
		File file = takeshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./myscrn1.png")); 
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		

	}

}
