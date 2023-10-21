package TestNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod3 {
	 @Test
	  public void testMethod5() {
		  
		  long threadID1 = Thread.currentThread().getId();
		  Reporter.log("thread id of testMethod5:"+ threadID1,true);
}
	 @Test
	  public void testMethod6() {
		  
		  long threadID1 = Thread.currentThread().getId();
		  Reporter.log("thread id of testMethod6:"+ threadID1,true);
	 }
}
