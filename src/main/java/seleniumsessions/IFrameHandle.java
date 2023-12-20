package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		
//	WebDriver driver =new ChromeDriver();
//		
//		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
//		
//		driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();
//		Thread.sleep(3000);
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
//		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("automation");
//		
//		driver.switchTo().defaultContent();
//		
//		Thread.sleep(3000);
//		
//		String header= driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
//		System.out.println(header);
//		
//		
		
		
		
		
		
		
		

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("automation");
		
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("USA");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("11/11/2023");
		//RESULT_TextArea-5
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@name='RESULT_FileUpload-6']"))
		.sendKeys("C:\\Users\\Mohit\\Desktop\\formsite.txt");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-8']")).sendKeys("Tom");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-9']")).sendKeys("Peter");

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-10']")).sendKeys("New Street");

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-11']")).sendKeys("New Street line");

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-12']")).sendKeys("City");

		
		WebElement stateOption=driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-13']"));
		Select select = new Select(stateOption);
		select.selectByIndex(5);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-14']")).sendKeys("10005");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-15']")).sendKeys("(100) 001-1111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-16']")).sendKeys("tom@gmail.com");

		driver.quit();

	}

}
