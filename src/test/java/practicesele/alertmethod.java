package practicesele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@id='js-alert']")).click();
		
		//driver.findElement(By.xpath("//button[@id='js-prompt']")).click();
		
		
		driver.findElement(By.xpath("//button[@id='js-confirm']")).click();
		
		Thread.sleep(3000);
		
		
		Alert al = driver.switchTo().alert();
		
		//al.sendKeys("sravan");
		
		
		Thread.sleep(3000);
		
		
		//al.accept();
		
		al.dismiss();
		
		
		String str = driver.getTitle();
		System.out.println(str);

	}

}
