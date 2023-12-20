package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		//selenium4.x: 
//		
//					e4(above)
//					|
//		e2(left)--ele-->e1(right)
//					|
//					e3(below)
//		e5(near)	
		
		

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.aqi.in/dashboard/canada");
		
		
		
		WebElement ele = driver.findElement(By.linkText("Cranbrook, Canada"));
		
		//right of ele
		
		//String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//left of ele
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		//above of ele: 
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//below of ele:
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		//near 
		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEle);

		//
		List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
		System.out.println(belowElements.size());
		
		for (WebElement e : belowElements) {
			String text = e.getText();
			System.out.println(text);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
