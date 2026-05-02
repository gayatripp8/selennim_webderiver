import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileuploadpopup_alert {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://html.com/input-type-file/");
	//Tip:-Without clicking on browse button use the senkeys method
	driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Admin\\Downloads\\agents-main1\\agents-main\\assets\\exercise.png");
	}

}
