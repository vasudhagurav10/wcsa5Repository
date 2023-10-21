package TestNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	 @Test
	  public void testMethod3() {
		  
		  long threadID1 = Thread.currentThread().getId();
		  Reporter.log("thread id of testMethod3:"+ threadID1,true);
  }
	 @Test
	  public void testMethod4() {
		  
		  long threadID1 = Thread.currentThread().getId();
		  Reporter.log("thread id of testMethod5:"+ threadID1,true);
}
}
