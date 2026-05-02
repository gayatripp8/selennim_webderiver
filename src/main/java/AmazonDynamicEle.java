import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDynamicEle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone 11");
		List<WebElement>AllOptions=driver.findElements(By.xpath("//div[@role='row']"));
		System.out.println("Total no of Options:"+AllOptions.size());
		
		for(WebElement ele:AllOptions) {
			String  text=ele.getText();
			System.out.println("Get the text of All options:"+ele.getText());
			
			if(text.equals("iphone 11 phone")) {
				ele.click();
				break;
			}
		}
	}

}
