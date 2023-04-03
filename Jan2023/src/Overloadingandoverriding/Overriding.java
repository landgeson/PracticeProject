package Overloadingandoverriding;


	
	 class Bank {
		int getRateOfIntrest() {
			return 0;
		}
	    }
		 class SBI extends Bank {
			int getRateOfIntrest() {
				return 9;
			}
			}
		 class ICIC extends Bank {
			int getRateOfIntrest() {
				return 9;
			}
			}
		 class AXIS extends Bank {
			int getRateOfIntrest() {
				return 10;
			}
			}


  public class Overriding {
	
	public static void main(String[] args) {
       Bank b=new Bank();
		Bank s=new SBI();
		Bank i=new ICIC();
		Bank a=new AXIS();
		
		System.out.println("Rate of intrest :"+s.getRateOfIntrest());
		System.out.println("Rate of intrest :"+i.getRateOfIntrest());
		System.out.println("Rate of intrest :"+a.getRateOfIntrest());
		
		

	}

}

