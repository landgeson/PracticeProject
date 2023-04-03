package Test;

import org.testng.annotations.Test;

public class ParalleltestTwo {
	@Test
	  public void testMethodOne() {
		  @SuppressWarnings("Deprecation")
		long Id=  Thread.currentThread() .getId();
		  System.out.println("Thread Id of one is:"+Id);
		  
	  }
	  @Test
	  public void testMethodTwo() {
		  @SuppressWarnings("Deprecation")
		long Id=  Thread.currentThread() .getId();
		  System.out.println("Thread Id of Two is:"+Id);
		  
	  }
}
