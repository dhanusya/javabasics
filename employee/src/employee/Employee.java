package employee;

public class Employee {
	double salary;
	String firstName;
	String lastNAme;
	int monthlysalary;
	
	
	
	
	
	public double getSalary() {
		return salary;
	}





	public void setSalary(double salary) {
	if(monthlysalary<0)
		this.monthlysalary=0;
	else
		this.salary = salary;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastNAme() {
		return lastNAme;
	}


       public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}
	
       
       public double Sample(){
    	   int montlysalary =1000;
		 salary=(montlysalary*12);
		 return salary;
		
	}

	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setFirstName("dhanusya");
		e1.setLastNAme("devi");
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastNAme());
	}
}

