
 class Pen {
	String  color;
	String type; 
	
	public void write() {
		
		System.out.println("Write Something");
	}
	 public void color() {
		 
		 System.out.println(this.color);
	 }
 public void type() {
		 
		 System.out.println(this.type);
	 }
 }

public class Codemo {

	public static void main(String[] args) {
		Pen pen1= new Pen();
		pen1.color="blue";
		pen1.type="gel";
		
		Pen pen2= new Pen();
		pen2.color="black";
		pen2.type="Ballpoint";
		
		pen1.write();
		pen1.color();
		pen1.type();
		pen2.color();
		pen2.type();
		

	}

}

