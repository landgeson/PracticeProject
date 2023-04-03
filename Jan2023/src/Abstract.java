abstract class Animal {
	abstract void Walk();
		
}
	 class Horse extends Animal{
		public void Walk() {
			System.out.println("Walks on 4 legs");
		}

		
			
		}
	
	 class Chiken extends Animal{
		public void Walk() {
			System.out.println("Walks on 2 legs");
		}
	}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Horse hours=new Horse();
      hours.Walk();
      Chiken c=new Chiken();
	    c.Walk();
      
       
	}

}
