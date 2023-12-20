 package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//before -- test -- after
	

//	BS--connect with DB
//	BT-- create user
//	BC-- launch browser
	
	//	BM-- loginToApp
	//	addToCartTest
	//	logout
//	
	//	BM-- loginToApp
	//	checkOutTest
	//	logout
//	
	//	BM-- loginToApp
	//	search test
	//	logout
	
//	closeBrowser
//	deleteUser
//	disconnect with DB
	
	
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS--connect with DB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT-- create user");
		
	}
	//3
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC-- launch browser");
	}
	//2//7//10
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM-- loginToApp");
	}
	//11
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	//5
	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
	//8
	@Test
	public void checkOutTest() {
		System.out.println("checkOutTest");
	}
	//6//9//12
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("deleteUser");
	}
	//15
	@AfterSuite
	public void disconnectTest() {
		System.out.println("disconnect with DB");
	}
	
}
