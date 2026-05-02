import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcarthiddenelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement>ipohoneList=driver.findElements(By.xpath("//li[@class='Swx5kP']"));
		System.out.println("Total no list:"+ipohoneList.size());
		
		for(WebElement ele:ipohoneList) {
			String text=ele.getText();
			System.out.println("Name of i phonelist:"+ele.getText());
			
			if(text.equals("iphone 13 pro")) {
				ele.click();
				break;
			}
		}
		
		
		

	}

}
