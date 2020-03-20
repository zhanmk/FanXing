
public class Employee extends Human{
	
	private String name;
	private String salary;
	
	public Employee(String name,String salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

}
