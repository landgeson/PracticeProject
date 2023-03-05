package Exceptionhandling;

public class trycatch {

	public static void main(String[] args) {
	  try {
		  
		  int a[]= {4};
		  System.out.println(a[4]);
	  
	  } catch (NullPointerException e)
	  {
		  
		  System.out.println("Your array is null");
	  }catch (ArrayIndexOutOfBoundsException e) {
		  
		  System.out.println("Your array is out of bound");
	  }catch (Exception e)
	  {
		  
		  System.out.println("Something else went wrong");
	  }
	  
	 

	}

}
