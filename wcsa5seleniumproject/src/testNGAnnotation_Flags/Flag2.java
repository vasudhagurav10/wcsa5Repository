package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "Login Method",enabled = true)
  public void method1() {
	  Reporter.log("method1 from flag2", true);
  }
  @Test(description = "Logout Mehtod",enabled = true)
  public void method2() {
	  Reporter.log("method2 from flag2", true);
  }
}
