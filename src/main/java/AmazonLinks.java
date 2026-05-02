import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + linkList.size());

        for (WebElement link : linkList) {
            System.out.println("name of links:"+link.getText());
        }

        driver.quit();
    }
}