package TestNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testMethod1() {
	  
	  long threadID1 = Thread.currentThread().getId();
	  Reporter.log("thread id of testMethod1:"+ threadID1,true);
  }
  @Test
  public void testMethod2() {
	  
	  long threadID1 = Thread.currentThread().getId();
	  Reporter.log("thread id of testMethod2:"+ threadID1,true); 
}
}
