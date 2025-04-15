package Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriver_utility {

	public void maximizewindow(WebDriver driver) {
		driver.manage().window().maximize();

	}
    public void waitElementToLoad(WebDriver driver)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
     public void switchtohandle(WebDriver driver,String partial_title) {
		
		Set<String> allWins = driver.getWindowHandles();
		Iterator<String> it = allWins.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.contains(partial_title)) {
				break;
			}
		}

		 }
     
     public void alert1(WebDriver driver) {
    	 driver.switchTo().alert().accept();
     }
     public void robert(WebDriver driver) throws AWTException, InterruptedException {
    	 Thread.sleep(2000);
    	 Robot r1 = new Robot();
    	 r1.keyPress(KeyEvent.VK_ENTER);
    	 r1.keyRelease(KeyEvent.VK_ENTER);
     }
     
     
     public static String takeScreenShotEx(WebDriver driver, String screenShotName)throws Throwable
     {
    	 TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
    	File src = takeScreenShot.getScreenshotAs(OutputType.FILE);
    	File des=new File("./ScreenShots/"+screenShotName+".png");
    	FileUtils.copyFile(src, des);
		return des.getAbsolutePath();
     }
}

