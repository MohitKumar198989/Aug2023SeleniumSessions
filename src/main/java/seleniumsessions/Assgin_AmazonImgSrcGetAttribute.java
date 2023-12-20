package seleniumsessions;

import org.openqa.selenium.By;

public class Assgin_AmazonImgSrcGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil brUtil= new BrowserUtil();
		//brUtil.launchBrowser("Chrome");
		//brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(brUtil.launchBrowser("Chrome"));
		brUtil.launchURL("https://www.amazon.com/");
		Thread.sleep(5000);
		By img =By.xpath("//*[@id=\"CardInstanceKN5xHSulCClu5_lzQPV__w\"]");
		System.out.println(eleUtil.doGetElementAttribute(img, "class"));
		
		
	}

}
