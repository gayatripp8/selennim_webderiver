package BasicScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		        public class AmazonLogin {
		            public static void main(String[] args) throws InterruptedException {

		                WebDriver driver = new ChromeDriver();

		                // Open Amazon
		                driver.get("https://www.amazon.in");
		                Thread.sleep(3000);

		                // Get Title
		                String title = driver.getTitle();
		                System.out.println("Title: " + title);

		                // Get Current URL
		                String url = driver.getCurrentUrl();
		                System.out.println("URL: " + url);
		                
		                //verify the title & URL
		                if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
		                	System.out.println("Title verified");
		                }
		                	else {
		                		System.out.println("Title missmatched");
		                		
		                	}
		                
		                if(url.endsWith("in/")) {
		                	System.out.println("URL is verified");
		                }
		                else {
		                	System.out.println("URL is wrong");
		                }
		                	
		                driver.quit();
		                }
		        }

		                