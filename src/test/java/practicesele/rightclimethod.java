package practicesele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclimethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		WebElement douele = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		act.contextClick(douele).build().perform();

		
		
	}

}
