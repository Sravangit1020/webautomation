package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diffbetbasicnxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    //driver.findElement(By.id("email")).sendKeys("1234");
			//driver.findElement(By.id("pass")).sendKeys("1234");
			//driver.findElement(By.id("loginbutton")).click();
		
		
		
		
	    WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login#google_vignette");
		Thread.sleep(2000);
		
		JavascriptExecutor scro = (JavascriptExecutor)driver;
		scro.executeScript("window.scrollTo(0,9000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("practice");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'pa')]")).sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[(text() = 'Login')]")).click(); 
		//driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();     //button[contains(@type, 'submit')]
		
		//driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("7995183402");
		//driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123456");
		//driver.findElement(By.xpath("//button[@name = 'login']")).click();
		//with text also
		
	}

}
