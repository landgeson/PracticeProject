package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters("username")
  @Test
  public void Testone(String name)  {
	 
	  System.out.println("Test method one called");
	  System.out.println("Test method one parameter is:"+ name);
  }
	@Parameters("Password")
	  @Test
	  public void Testtwo(String pwd)  {
		 
		  System.out.println("Test method two called");
		  System.out.println("Test method two parameter is:"+ pwd);
	  }
}
