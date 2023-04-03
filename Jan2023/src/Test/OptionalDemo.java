package Test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class OptionalDemo {
	 @Test
	    @Parameters({"Browser","url"})
	        // I used Optional annotation with parameter declaration 
	    public void testMethod(@Optional("chrome") String testParameters1, @Optional("http//www.google.com") String testParameters2)
	    {
	        System.out.println("Paramters one for test method: "+testParameters1);
	        System.out.println("Paramters two for test method: "+testParameters2);
	    }
	 @Test
	    @Parameters({"username"})
	 public void testMethod(@Optional("Sonali") String testParameters1)
	 {
		 System.out.println("Paramters one for test method: "+testParameters1); 
	 }
	 
	     
}
