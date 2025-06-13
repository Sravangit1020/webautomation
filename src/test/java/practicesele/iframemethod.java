package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframemethod {

	public static void main(String[] args ) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		Thread.sleep(2000);
		
		JavascriptExecutor scrol = (JavascriptExecutor)driver;
		
		scrol.executeScript("window.scrollTo(0,1000)");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("mce_0_ifr");
		
		
		driver.findElement(By.xpath("//p[text() = 'Your content goes here.']")).sendKeys("sravan");
		
		//driver.switchTo().parentFrame();  for single page
		
		
		driver.switchTo().defaultContent();   // for main page
		
	}

}
