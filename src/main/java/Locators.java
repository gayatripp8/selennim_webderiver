import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//id

		
		//name
		//driver.findElement(By.name("field-keywords")).sendKeys("T-shirts");
		
	//class
		//List<WebElement>Links=driver.findElements(By.className("nav_a"));
		//System.out.println("Total no of haederLinks: "+ Links.size());
		
		//tag
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total no of images: "+images.size());
		
		//if(actualCount == expectedCount) {
			
		}
		
	}
	



