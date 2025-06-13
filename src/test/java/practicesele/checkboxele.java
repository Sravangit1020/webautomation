package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		Thread.sleep(2000);
		
		JavascriptExecutor scro = (JavascriptExecutor)driver;
		scro.executeScript("window.scrollTo(0,9000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for = 'checkbox1']")).click();
		
		
		

	}

}
