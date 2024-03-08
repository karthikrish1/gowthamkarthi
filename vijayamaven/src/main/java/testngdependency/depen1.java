package testngdependency;

import org.testng.annotations.Test;

public class depen1 {

	//dependsonmethod: create connection between the test cases 
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visitinh");
	}
	
	@Test(priority=1,dependsOnMethods="visiting")
	public void lgn()
	{
		System.out.println("login");
	}
	
	//visiting: pass      lgn: pass
	// visiting: failed   lgn: skipped 
}
