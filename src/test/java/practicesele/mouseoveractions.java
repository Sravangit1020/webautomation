package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		driver.switchTo().frame("iframeResult");

		
		WebElement img1 = driver.findElement(By.xpath("//img[@alt= 'Smiley']"));
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.moveToElement(img1).build().perform();
		
		
		
		
		
		
		
		
		

	}

	private static Actions moveToElement(Actions act) {
		// TODO Auto-generated method stub
		return null;
	}

}
