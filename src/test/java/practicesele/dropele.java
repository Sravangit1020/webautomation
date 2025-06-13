package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		Thread.sleep(0,9000);
		

		JavascriptExecutor scro = (JavascriptExecutor)driver;
		scro.executeScript("window.scrollTo(0,9000)");
		Thread.sleep(2000);
		
		
		WebElement de = driver.findElement(By.xpath("//select[@id= 'country']"));
		 
		//de.click();
		
		Select selee = new Select(de);
		
		//selee.selectByIndex(9);
		
		Thread.sleep(2000);
		
		
		//selee.selectByVisibleText("india");   // not working
		
		
		selee.selectByValue("AS");
		
		
		
		
		
		

	}

}
