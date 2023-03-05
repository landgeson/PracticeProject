class Student {
	String name;
	int age;
	
	public void printInfo() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}

  //Non-Parameterized constructor 
 //Student() {
	 
	 //System.out.println("Constructor called");
	 
	 
 //}
	
	//Parameterized constructor :
	//Student (String name,int age){
		
	//this.name =name;
	//this .age=age;
	
	
	
	//copy constructor
	Student (Student S2){
		
		this.name =S2.name;
		this .age=S2.age;
	}
	Student(){
		
		
	}
}

public class Constructor {

	public static void main(String[] args) {
		
       Student s1= new Student();
     s1.name= "new";
       s1.age=24;
       Student s2= new Student();
		s1.printInfo();
	}

}
