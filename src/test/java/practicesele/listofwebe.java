package practicesele;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listofwebe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// list

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		Thread.sleep(2000);

		List<WebElement> li = driver.findElements(By.xpath("")); // getting error plz findout before

		//System.out.println(li.size());

	}

}
