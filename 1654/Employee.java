package test.com;
import java.io.Serializable;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Employee implements Serializable
{
    private int employeeid;
    private String EmployeeName;
    private int deptid;
    private int salary;

    public Employee() {
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeid != employee.employeeid) return false;
        if (deptid != employee.deptid) return false;
        if (salary != employee.salary) return false;
        return EmployeeName.equals(employee.EmployeeName);

    }

    @Override
    public int hashCode() {
        int result = employeeid;
        result = 31 * result + EmployeeName.hashCode();
        result = 31 * result + deptid;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return
                "employeeid=" + employeeid +
                ", employeeName='" + EmployeeName + '\'' +
                ", deptid=" + deptid +
                ", salary=" + salary ;
    }
}



