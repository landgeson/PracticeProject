package Accessdemo1;

import Accessdemo2.Access3;

public class Access2 {

	public static void main(String[] args) {
		
		Access1 a=new Access1();
		
		System.out.println(a.hours);
		System.out.println(a.min);
		
Access3 b=new Access3();
		
		System.out.println(a.hours);
		System.out.println(a.min);
		
		//Method
		
		System.out.println(a.gethours());
		System.out.println(a.getmin());
		
		

	}

}
