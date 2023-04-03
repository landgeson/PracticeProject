package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmapledatProvider {
	@DataProvider(name="browserdata")
	public Object[][] dataProviderMethod()
	{
		return new Object[][] {{"chrome"},{"Firefox"},{"Safari"},{"IE"}};
		
	}
  @Test (dataProvider="browserdata")
  public void testMethod(String data) {
	  System.out.println("Browser excuted:"+data);
  }
}
