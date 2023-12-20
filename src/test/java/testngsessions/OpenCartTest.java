package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart");
		
		
	}
	@Test(priority=2)
	public void isOpenCartLogIsVisibleTest() {
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test(priority=3)
	public void openCartTitleTest() {
		String actulaTitle= driver.getTitle();
		System.out.println(actulaTitle);
		Assert.assertEquals(actulaTitle, "Your Store");
	}
	
	@Test(priority=1)
	public void openCartURLTest() {
		String actualURL = driver.getCurrentUrl();
		Assert.assertTrue(actualURL.contains("opencart"));
	}
	
	@Test
	public void atest() {
		System.out.println("atest");
	}
	@Test
	public void btest() {
		System.out.println("btest");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
