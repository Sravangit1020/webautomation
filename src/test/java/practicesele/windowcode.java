package practicesele;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/windows");
		  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()= 'Click Here']")).click();
		
		
		String win1 = driver.getWindowHandle();
		System.out.println("window 1 address code"+win1);
		
	
		Set <String>  allwin = driver.getWindowHandles();
		System.out.println("print all window address code what we open " + allwin);
		
		
		List <String> li = new ArrayList<> (allwin);
		
		String w2 = li.get(1);
		
		System.out.println("window 2 address code" + w2);
		
		
		String titl=driver.getTitle();
		
		
		System.out.println("this is the first window "+titl);
		
		
		
		driver.switchTo().window(w2);
		
		String finaltitle = driver.getTitle();
		
		System.out.println("this is the final tile page"+finaltitle);
		
		Thread.sleep(3000);
		
		
		driver.close();
		
		//driver.quite();
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
