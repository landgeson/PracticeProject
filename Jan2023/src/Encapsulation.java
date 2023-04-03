class Employee {
	
	private String empName;
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
		
	}
public class Encapsulation {

	public static void main(String[] args) {
		
       Employee e=new Employee();
       e.setEmpName("Sonali");
       {
    	   System.out.println(e.getEmpName());
       }
	}

}
