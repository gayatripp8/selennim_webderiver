import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("mukesh otwani");
		List<WebElement>AllOptions=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Total no of options:"+AllOptions.size());
		
		/*for(WebElement ele:AllOptions) {
			String  text=ele.getText();
			System.out.println("Get the terxt of all options:"+text);
			if(text.contains("youtube"))
			{
				ele.click();
				
			}
			*/
		for(int i=0;i<AllOptions.size();i++) {
			WebElement ele=AllOptions.get(i);
			System.out.println("Total no of option text:"+ele.getText());
			
			if(ele.getText().equalsIgnoreCase("new batch")) {
				ele.click();
				break;
				}
		}
			
		}
	}


