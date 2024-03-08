package tesgnattributes;

import org.testng.annotations.Test;

public class t1 {

	// test next generation
	// testing framework
	// from junit
	// automatic report genreration
	// annotaitons, assertions, parallel,...
	
	// test case
	//     nonstatic
	//     @Test
	//     default order: alphabetical order
	
	// priority:   arrange the test case in particular order 
	// description: add short note on the test case 
	// invocationcount: run the same test case for multiple time 
	//groups 
	// enabled=false => disable/ignoring  the testcase 
	//timeout : fix time limit for test case 
	
	@Test(priority=0,description="FIRSTTT",invocationCount=10,groups="v",enabled=false )
	public void m1()
	{
		System.out.println("test case 1");
	}
	
	@Test(priority=1,groups="v")
	public void ab()
	{
		System.out.println("test case 2");
	}
	
	@Test(priority=2,description="THREE#",groups="l")
	public void m2()
	{
		System.out.println("test case 3");
	}
}
