package test.com;
import java.lang.Throwable;

public class InvalidSalaryException extends Exception {
    int sal;

    public InvalidSalaryException(int sal){
        this.sal = sal;
    }

    public String toString(){
        return "Invalid salary entered";
    }
}
