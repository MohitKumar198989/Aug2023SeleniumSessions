package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("login to app");
		int i=9/0; 
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods="searchTest")
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
	
	//AAA: Arrange, ACt , and Assesrt
	//no dependency
	//no priority
	//test cases/methods should be independent 
	
	@Test
	public void searchTest1() {
		//login(un,pwd)
		//search(macbook)
		//assertion: only one assert
		//a1: failed
		//a2
		//a5
	}
	
	//url, title, logo, login, footer
	//opencartTest()-->
}
