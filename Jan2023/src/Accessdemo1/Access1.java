package Accessdemo1;

public class Access1 {

	//default- access in same package
	//public- access in same and different package
	//private-access in same class only
	//protected -access in same package -- (using extends key word in different package)
	
		protected int hours=4;
		protected  int min =35;
		
		//Methods
		
		protected int gethours() {
			return hours;
			
		}
		protected int getmin() {
			
			return min;
		}
		
		
		
		

	

}
