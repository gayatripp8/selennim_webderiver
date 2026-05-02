package BasicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_GetURL {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		String URL=driver.getCurrentUrl();
		System.out.println("The current URL is:"+URL);
		
		String Title=driver.getTitle();
		System.out.println("The title of page is:"+Title);

	}

}
