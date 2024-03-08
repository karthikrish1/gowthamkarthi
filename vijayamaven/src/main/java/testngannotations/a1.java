package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test   : run only once before all the tst cases started its execution
	 * after test    : run only once after allthe test cases finished its execution
	 * 
	 * befre class: run only once, after before test 
	 * afterclass: run only once, before after test 
	 * 
	 * before method: run before each test case
	 * after method:  run after each test case 
	 * 
	 * before test : visiting website 
	 *   before class : max
	 *       before method : refresh   tc1: title    aftermethod: deleting cookies
	 *       before method : refresh   tc2: click   aftermethod : deleting cookies
	 *       
	 *    after class : getting url
	 * after test : closing 
	 * 
	 *  * 
	 * */
	ChromeDriver ob;
	@Test
	public void t1()
	{
		System.out.println("test case 1");
		System.out.println(ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		System.out.println("before test ");
	}
	
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}
	
	
	@Test
	public void t2()
	{
		System.out.println("test case 2");
		ob.findElementByLinkText("Help").click();
	}
	

	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class ");
		System.out.println(ob.getCurrentUrl());
		
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
		ob.navigate().refresh();
	}
	
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method ");
		ob.manage().deleteAllCookies();
	}
	
	
}
