abstract class Animal1 {
	abstract void walk();
	Animal1(){
		System.out.println("You are creating anew Animal");
	}
	}
	 class Horse1 extends Animal1{
		 Horse1(){
			 System.out.println("Created a horse");
		 }
		public void walk() {
			System.out.println("Walks on 4 legs");
		}
}
	
	 class Chiken1 extends Animal1{
		public void walk() {
			System.out.println("Walks on 2 legs");
		}
	}



public class Constructor2 {

	public static void main(String[] args) {

		Horse1 hours=new Horse1();
		

	}

}
