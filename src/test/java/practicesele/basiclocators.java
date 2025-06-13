package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiclocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//webdriver is a interface
		//opencrome is a reference
		//chromeDriver is a class
		//crtl+shift+i    to open inspect 
		
		
		WebDriver driver = new ChromeDriver(); //  after this webdriver type "ctrl+shift+o"  to  add import 
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000); mouse over on it and click add throw link.
		//opencrome.navigate().refresh();
		//Thread.sleep(2000);
		
		//opencrome.navigate().back();
		//Thread.sleep(2000);
		
		//opencrome.navigate().forward();
		
		//opencrome.close(); // close the single tab
		//opencrome.quit(); close all the tabs
		Thread.sleep(2000);
		
	    driver.findElement(By.id("email")).sendKeys("1234");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		//opencrome.findElement(By.linkText("Forgotten password?")).click();
		

	}

}
