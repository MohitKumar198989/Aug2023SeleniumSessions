package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {


		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//get the total link on the page 
		//get the text of each link
		//but ignore the black text links 
		//get the href value of each link
		
		//links--> <a>

		List<WebElement> LinkList= driver.findElements(By.tagName("a"));
		System.out.println(LinkList.size());
		
//		for (int i=0;i<=LinkList.size();i++) {
//			String text= LinkList.get(i).getText();
//			if(text.length()!=0) {
//			System.out.println(i+" : "+text);
//			}
//			
//		}
		
//		for(WebElement e: LinkList) {
//			String text= e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//				}
//		}
		
		for(WebElement e: LinkList) {
			String text= e.getText();
			if(text.length()!=0) {
				String hrefValue= e.getAttribute("href");
				System.out.println(text+"==="+hrefValue);
				}
		}
		
		//web scrapping 
		
	}

}
