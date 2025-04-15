import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XYZ {
	
	@Test(dataProvider = "readContactNames")

	Run | Debug

	public void createContact(String firstName, String lastName) {

	ChromeDriver driver = new ChromeDriver();

	driver.get("http://localhost:8888/");

	driver.manage().window().maximize();

	driver.findElement(By.name("user_name")).sendKeys("admin");

	driver.findElement(By.name("user_password")).sendKeys("admin");

	driver.findElement(By.id("submitButton")).click();

	driver.findElement(By.linkText("Contacts")).click();

	driver.findElement(By.cssSelector("[alt='Create Contact...']")).click();

	driver.findElement(By.name("firstname")).sendKeys(firstName);

	driver.findElement(By.name("lastname")).sendKeys (lastName);

	driver.findElement(By.cssSelector("[title='Save [Alt+S]']")).click();

	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();

	driver.findElement(By.linkText("Sign Out")).click();

	driver.quit();

	}

	@DataProvider

	public Object[][] readContactNames() {

	Object[][] objArr = new Object[4][2];

	objArr[0][0] = "Shobha";

	objArr[0][1] = "RAni";

}
}