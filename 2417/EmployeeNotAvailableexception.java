package subbu.java.test;

public class EmployeeNotAvailableexception extends Exception {

	int EmpID;
	
	EmployeeNotAvailableexception(int EID){
		this.EmpID=EID;
	}
	
	public String toString() {
	return "EmployeeID - " + this.EmpID + " not found \n";
	}
	
}
