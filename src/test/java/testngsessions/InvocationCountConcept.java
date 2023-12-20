package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	//not use much in Selenium, not much use case
	@Test(invocationCount=10)
	public void searchProductTest() {
		System.out.println("searchProductTest");
	}
	
	
	
}
