package Overloadingandoverriding;


	
	  class Calculation {
		
		public void sum(int a,int b) {
			
			System.out.println(a+b);
			
		}
		public void sum(int a,int b,int c) {
			
			System.out.println(a+b+c);
		}
	}
	 public class Overloading {

	public static void main(String[] args) {
		
		Calculation obj=new Calculation();
	obj.sum(30,3);
	obj.sum(30,3,10);
	
		
		
		
	}

}
