package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class r1 {
	
	ChromeDriver ob;
	
		@Test(priority=0,description="visiting", groups="u")
		public void visitting()
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
			 ob= new ChromeDriver();
			ob.get("http://www.mycontactform.com");
		}
		
		@Test(priority=1,description="maximising", groups="u")
		public void max()
		{
			ob.manage().window().maximize();
		}
		
		
		@Test(priority=2,description="refreshing", invocationCount=3,groups="u")
		public void refresh()
		{
			ob.navigate().refresh();
		}
		
		
		
		@Test(priority=3,description="clicking", dependsOnGroups="u")
		public void clicking()
		{
ob.findElementByLinkText("Help").click();
		}
		
		@Test(priority=4,description="closing", timeOut=4000,dependsOnGroups="u")
		public void closing() throws InterruptedException
		{
			Thread.sleep(2000);
			ob.quit();
		}
		



}
