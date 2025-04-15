package DDT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prokabbadi_pointTable {
	public static void main(String[] args) throws Throwable {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Thread.sleep(2000);
		// Wait for the cookie pop-up to appear
		WebElement cookiePopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Reject All']")));
          
		// Click on "Reject All" or "Accept All"
		cookiePopup.click();
		
		
		WebElement pklAlertClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='close-btn']")));

		// Click the close button
		pklAlertClose.click();
		//String name="Haryana Steelers";
		 String won = driver.findElement(By.xpath("//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class='table-data matches-won']")).getText();
		 String loss= driver.findElement(By.xpath("//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class='table-data matches-lost']")).getText();
		 String ptds= driver.findElement(By.xpath("//p[text()='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class='table-data points']")).getText();
		System.out.println("matches won"+won);
		System.out.println("matches loss"+loss);
		System.out.println("matches points"+ptds);
		////p[text()='Haryana Steelers']/ancestor::div[@class='row-head']//div[@class='table-data points']
	}
}
