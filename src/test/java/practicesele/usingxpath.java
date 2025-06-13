package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingxpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("7995183402");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name = 'login']")).click();

	}
;
}
