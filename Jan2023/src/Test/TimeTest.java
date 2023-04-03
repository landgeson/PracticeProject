package Test;

import org.testng.annotations.Test;

public class TimeTest {
	@Test(timeOut=500)
	  public void Testone() throws InterruptedException {
		  Thread.sleep(1000);
		  System.out.println("Test method one called");
	  }
	  @Test(timeOut=500)
	  public void Testtwo() throws InterruptedException {
		  Thread.sleep(400);
		  System.out.println("Test method two called");
	  }

}
