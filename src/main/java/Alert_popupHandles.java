import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popupHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println("The text is:"+alert.getText());
		String text=alert.getText();
		if(text.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		alert.accept();//=>will click on okay button 
		//alert.dismiss();//=>will click on cancel button
	
	}

}
