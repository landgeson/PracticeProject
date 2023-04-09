package Test;

import org.testng.annotations.Test;

public class Disabledtest {
	@Test(enabled=true)
	  public void methodone() {
	 System.out.println("Test method one ");
		  }
	@Test(enabled=false)
	  public void methodtwo() {
	 System.out.println("Test method two ");
		  }
	@Test(enabled=true)
	  public void methodthree() {
	 System.out.println("Test method three ");
		  }
}
