package subbu.java.test;

public class Employee{
	
	private int EmployeeID;
	private String EmployeeName;
	private double Salary;
	
	public Employee(int EID, String EName, double Sal){
		this.EmployeeID = EID;
		this.EmployeeName = EName;
		this.Salary = Sal;
		
	}
	
	public Employee(int EID, double Sal) {
		super();
		this.Salary = Sal;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary + "]";
	}
	
	
	
}