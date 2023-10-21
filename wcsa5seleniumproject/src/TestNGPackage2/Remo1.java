package TestNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo1 {
  @Test
  public void method3() {
		  Reporter.log("This is a method3", true);
	  }
		  
	  @Test
	  public void method4() {
		  int a=4;
		  int b=20;
		  int res=b/a;
		  Reporter.log("This is a method4", true);
	  }
  }

