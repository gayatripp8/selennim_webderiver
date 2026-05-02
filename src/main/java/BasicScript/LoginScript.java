package BasicScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void WaitTime() throws InterruptedException{
	Thread.sleep(2000);
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login script.
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.navigate().to("https://www.saucedemo.com/inventory-item.html?id=4");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Validation of current title & URL
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("Current URL is:"+ CurrentURL);
		
		if(CurrentURL.contains("")) {
			System.out.println("URL is correct & verified");
			}
		else {
			System.out.println("URL is incorrect & not verified");
		}

		//validation of title
		String Currenttitle=driver.getTitle();
		System.out.println("current title is:"+Currenttitle);
		if(Currenttitle.contains("Swag Labs")) {
			System.out.println("current title is verified & matched");
					}
		
		else {
			System.out.println("current title is missmatched");
		}

	}

}
