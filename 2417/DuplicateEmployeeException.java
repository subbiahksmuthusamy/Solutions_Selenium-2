package subbu.java.test;


public class DuplicateEmployeeException extends Exception {
	
	int EmpID;
	
	DuplicateEmployeeException(int EID){
		this.EmpID=EID;
	}
	
	public String toString() {
	return "EmployeeID - " + this.EmpID + " already exists \n";
	}
}
