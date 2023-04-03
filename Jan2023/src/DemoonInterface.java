  interface I1
{
	public void Show();
}
  interface I2
  {
	  public void Display();
  }
 class test implements I1 {
	 
	 public void Show() {
		 
		 System.out.println("12345");
	 }
	 public void Display() {
		 System.out.println("Dog");
	 }
 }
public class DemoonInterface {

	public static void main(String[] args) {
		test t=new test();
		t.Show();
		t.Display();

	}

}
