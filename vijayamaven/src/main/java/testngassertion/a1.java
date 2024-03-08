package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglistener.c1.class)
public class a1 {
	
	/*assertion:  tech where we will be comparing actual result with obtained result
	 * 
	 * hard :   Assert, static
	 *         fails=> it will not proceedfurther  
	 * 
	 * soft
	 *     softassert,  nonstatic
	 *     assertall()
	 * 
	 * assertEqual(actual, expected)
	 * assertNotEqual(actual, expected)
	 * assertTrue(condi)
	 * assertfalse(cond)
	 * * 
	 * */
	
	@Test
	public void hs()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		 ob.get("http://www.google.com");
		// Assert.assertEquals(ob.getTitle(),"yahoo");
		 Assert.assertNotEquals(ob.getTitle(),"yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		 ob.quit();
	}

}
