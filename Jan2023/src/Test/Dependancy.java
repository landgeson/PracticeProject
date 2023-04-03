package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependancy {
  @Test (dependsOnMethods="Login")
  public void FundTransper() {
	  System.out.println("FundTransper method called");
  }
  @Test
  public void Login() {
	  System.out.println("Login method called");
	 // Assert.assertTrue(true);
	  Assert.assertTrue(false);
  }
}
