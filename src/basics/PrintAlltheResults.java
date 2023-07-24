package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class PrintAlltheResults {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        WebElement sb=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        sb.sendKeys("Selenium IDE");
        sb.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		for(WebElement link:links)
		{
			
			System.out.println(link.getAttribute("href"));
			//System.out.println(link.getText());
		}
		
		driver.quit();
         
      
        }

       
	}

