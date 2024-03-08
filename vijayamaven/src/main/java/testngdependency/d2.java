package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	//dependsongroups: create connection between the test cases  and group
	
	@Test(priority=0,groups="vijaya")
	public void t1()
	{
		System.out.println("tc1");
	}
	
	@Test(priority=1,groups="vijaya")
	public void t2()
	{
		System.out.println("tc2");
	}
	
	
	@Test(priority=2,dependsOnGroups="vijaya")
	public void m()
	{
		System.out.println("tesc3");
	}

}
