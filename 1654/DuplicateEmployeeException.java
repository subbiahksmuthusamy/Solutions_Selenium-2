package test.com;
import java.lang.Throwable;

public class DuplicateEmployeeException extends  Exception {
    private int empid;

    public DuplicateEmployeeException(int empid){
        this.empid = empid;
    }

    public String toString(){
        return "Duplicate employeed id entered:" + empid;
    }
}
