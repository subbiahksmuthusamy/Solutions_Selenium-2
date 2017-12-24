package test.com;
import java.lang.Throwable;

public class EmployeeNotAvailableException extends  Exception {
    int empid;

    public EmployeeNotAvailableException(int empid){
        this.empid = empid;
    }

    public String toString(){
        return "Employee id:" + empid + " not found";
    }
}
