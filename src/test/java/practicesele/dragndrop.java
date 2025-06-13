package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		WebElement redbtn = driver.findElement(By.xpath("//div[@class='red']"));
		
		WebElement greenbtn = driver.findElement(By.xpath("//div[@class='green']"));
		
		WebElement bluebtn = driver.findElement(By.xpath("//div[@class='blue']"));
		
		WebElement targetele = driver.findElement(By.xpath("//div[@id='target']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(redbtn,targetele).build().perform();
		Thread.sleep(3000);
		
		act.dragAndDrop(greenbtn,targetele).build().perform();
		Thread.sleep(3000);
		
		act.dragAndDrop(bluebtn,targetele).build().perform();
		

	}

}
