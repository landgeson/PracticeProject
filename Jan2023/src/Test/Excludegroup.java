package Test;

import org.testng.annotations.Test;

public class Excludegroup {
  @Test(groups="group-1")
  public void methodone() {
	  
	  System.out.println("Test method one belongs to group-1");
	  }

	  @Test(groups="group-1")
	  public void methodtwo() {
		  
		  System.out.println("Test method two belongs to group-1");
		  }
	
		  @Test(groups={"group-1","group-2"})
		  public void methodthree() {
			  
			  System.out.println("Test method three belongs to 2 group");
			  }
		  @Test(groups={"group-3","group-2"})
		  public void methodFour() {
			  
			  System.out.println("Test method Four belongs to 2 group");
			  }
}
