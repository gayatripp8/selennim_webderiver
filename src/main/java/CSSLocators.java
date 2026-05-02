import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.findElement(By.cssSelector(".nav-input#twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.cssSelector(".nav-search-submit.nav-sprite")).click();
		List<WebElement>images=driver.findElements(By.cssSelector("img"));
		System.out.println("Total no of images:"+images.size());
		
		String title=driver.getTitle();
		System.out.println("The title of page:"+title);
		if(title.contains("Amazon.in : shoes")) {
			System.out.println("The title is correct & verified");
			}
		else {
			System.out.println("The Title is incorrect & not verified");
		}
		
		List<WebElement>links=driver.findElements(By.cssSelector("a"));
		System.out.println("The no of links:"+links.size());
		*/
		//Attribute & css selsctor 
		//driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("laptop");
		//driver.findElement(By.cssSelector(".nav-title[xpath=\"1\"]"))
		driver.findElement(By.cssSelector(".nav-search-dropdown[name='url']")).click();
		driver.findElement(By.xpath("//option[@value='search-alias=nowstore']"));
        driver.findElement(By.cssSelector("#searchDropdownBox>option:nth-of-type(7)")).click();
		
		//driver.quit();
	}

}
