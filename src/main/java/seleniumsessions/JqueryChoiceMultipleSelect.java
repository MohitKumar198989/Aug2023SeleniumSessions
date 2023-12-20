package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JqueryChoiceMultipleSelect {

	public static void main(String[] args) {

		BrowserUtil brUtil= new BrowserUtil();

		ElementUtil eleUtil = new ElementUtil(brUtil.launchBrowser("Chrome"));
		brUtil.launchURL("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		By selectChoice =By.id("justAnInputBox");
		eleUtil.doClick(selectChoice);
		By OptionLocator=By.cssSelector("span.comboTreeItemTitle");
		List<WebElement> OptionLocatorList= eleUtil.getElements(OptionLocator);
		for (WebElement e : OptionLocatorList) {
			String text =e.getText();
			System.out.println(text);
			e.click();
			if(e.getText()=="choice 7"){
				break;
			}
			
			
			
		
	}
		//eleUtil.selectDropDownMultipleValues(selectChoice, OptionLocator, "choice 2");
		//eleUtil.selectDropDownMultipleValues(selectChoice, OptionLocator, 	"choice 2", "choice 2 1");
		//eleUtil.selectDropDownMultipleValues(selectChoice, OptionLocator, "all");
		
		
	}
	


}
