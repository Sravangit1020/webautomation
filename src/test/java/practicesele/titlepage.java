package practicesele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		Thread.sleep(2000);
		
		String stri = driver.getTitle();
		
		System.out.println(stri); 
		
		String urll = driver.getCurrentUrl();
		
		System.out.println(urll);
		
		String codee = driver.getPageSource();
		
		System.out.println(codee);
		
		
		

	}

}
