package BasicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	//WebDriver driver1=new FirefoxDriver();
	
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	

	}

}
