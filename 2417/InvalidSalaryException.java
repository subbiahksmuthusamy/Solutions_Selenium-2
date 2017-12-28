package subbu.java.test;

public class InvalidSalaryException extends Exception {

	Double EmpSal;
	
	InvalidSalaryException(double ESal){
		this.EmpSal=ESal;
	}
	
	public String toString() {
	return "Employee Salary - " + this.EmpSal + " should be greater than 0 \n";
	}
}
