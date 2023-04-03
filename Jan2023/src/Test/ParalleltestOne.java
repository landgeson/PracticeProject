package Test;

import org.testng.annotations.Test;

public class ParalleltestOne {
  @Test (description="Login Test")
  public void testMethodOne() {
	  @SuppressWarnings("Deprecation")
	long Id=  Thread.currentThread() .getId();
	  System.out.println("Thread Id of one is:"+Id);
	  
  }
  @Test(description="Fund transfer Test")
  public void testMethodTwo() {
	  @SuppressWarnings("Deprecation")
	long Id=  Thread.currentThread() .getId();
	  System.out.println("Thread Id of Two is:"+Id);
	  
  }
}
