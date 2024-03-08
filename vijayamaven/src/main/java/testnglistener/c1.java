package testnglistener;

import org.testng.ITestListener;
import org.testng.ITestResult;

////ITestListener:   onstart(), onfinish, ontestsucess, ontestfailure
// create connection between c1 and ITestListener
// implements interfacename,  implements ITestListener
//right click=> source=> override/implement methods
public class c1 implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess!!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed!!!!");
	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Skipped!!!!");
	}
	
	//ITestListener:   onstart(), onfinish, ontestsucess, ontestfailure
	// create connection between c1 and ITestListener
	// implements interfacename,  implements ITestListener
	//right click=> source=> override/implement methods

}
