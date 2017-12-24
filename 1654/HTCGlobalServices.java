package test.com;
import java.io.Serializable;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Throwable;
import static java.lang.System.exit;
/* Make sure to download the following files before running HTCGlobalServices.java file
1.Employee.java
2.ICompanyServiceprovider.java - Interface
3.DuplicateEmployeeException -Exception class
4.EmployeeNotAvailaleException  -Exception class
5.InvalidSalaryException -Exception class
This program does CRUD operation on employee and it always a displays a employee list for reference at the end

 */


public class HTCGlobalServices implements ICompanyServiceProvider {
    public int companyid;
    public String companyAddress;
    public HashMap<Integer, Employee> EmployeeMap;

    public void loadMap() throws FileNotFoundException, IOException, ClassNotFoundException
    {


        File f1 = new File("C:\\test\\htclog.txt");
        if (f1.exists() && f1.length() > 0) {
            //System.out.println("map loaded");
            FileInputStream fs = new FileInputStream(f1);
            ObjectInputStream o = new ObjectInputStream(fs);
            EmployeeMap = (HashMap<Integer, Employee>) o.readObject();
           // System.out.println("emp:" + EmployeeMap);
            o.close();
        }

    }

    public void saveMap() throws FileNotFoundException, IOException, ClassNotFoundException
    {   boolean s;
        File dr =new File("C:\\test");
        if (!dr.exists())
        {
             s=new File("C:\\test").mkdir() ;
        }

        File f1 = new File("C:\\test\\htclog.txt");
            f1.createNewFile();
            FileOutputStream os = new FileOutputStream(f1, false);
            ObjectOutputStream o = new ObjectOutputStream(os);
            o.writeObject(EmployeeMap);
            o.close();

    }


    public Employee getInput(Employee e, int opr)throws NumberFormatException,Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee id:");
        try
        {
            e.setEmployeeid(Integer.parseInt(scan.nextLine()));

        }
        catch (NumberFormatException ne) {
            System.out.println("Data entered is not a number");
            exit(0);
        }


        if (opr == 1 || opr == 3) {
            System.out.println("Enter employee name:");
            e.setEmployeeName((scan.nextLine()));
            try {
                System.out.println("Enter Department id:");
                e.setDeptid(Integer.parseInt(scan.nextLine()));
                System.out.println("Enter salary amount:");
                e.setSalary(Integer.parseInt(scan.nextLine()));
                if (e.getSalary() < 0) {
                    throw new InvalidSalaryException(e.getEmployeeid());
                }

            }
            catch (NumberFormatException ne)
            {
                 System.out.println("entered value is not a number for salary or dept id" + "\n");
                exit(0);
            }

        }
        return e;

    }

    @Override
    public void addEmp(Employee e)  throws Exception
    {
        if (!EmployeeMap.containsKey(e.getEmployeeid())) {
            EmployeeMap.put(e.getEmployeeid(), e);

        } else {
            throw new DuplicateEmployeeException(e.getEmployeeid());

        }

    }

    @Override
    public void deleteEmp(Employee e) throws Exception
    {    getAllEmpList();
        if (EmployeeMap.containsKey(e.getEmployeeid()))
        {
            EmployeeMap.remove(e.getEmployeeid());


        } else
        {
            throw new EmployeeNotAvailableException(e.getEmployeeid());
        }
    }

    @Override
    public void updateEmp(Employee e) throws Exception{
        getAllEmpList();
        if (EmployeeMap.containsKey(e.getEmployeeid())) {
            EmployeeMap.replace(e.getEmployeeid(), e);


        } else {
            throw new EmployeeNotAvailableException(e.getEmployeeid());
        }

    }

    @Override
    public Employee getEmp(Employee e) throws  Exception{
        if (EmployeeMap.containsKey(e.getEmployeeid())) {
            e = EmployeeMap.get(e.getEmployeeid());
            return e;
        }
        else {
            getAllEmpList();
            throw new EmployeeNotAvailableException(e.getEmployeeid());
        }
    }

    @Override
    public boolean getAllEmpList()
    {
        if (!EmployeeMap.entrySet().isEmpty()) {
            System.out.println("Employee List");
            for (Map.Entry<Integer, Employee> entry : EmployeeMap.entrySet()) {

                System.out.println(entry.getValue());

            }
            return true;
        }
        else
        {
            System.out.println("No employees details to display");
            return false;
        }



    }


    public static void main(String args[]) throws IOException, ClassNotFoundException,NumberFormatException,Exception
    {
        int opr=0;
        HTCGlobalServices h1 = new HTCGlobalServices();
        h1.EmployeeMap = new HashMap<Integer, Employee>();
        h1.companyid = 1;
        h1.companyAddress = "3230 Big beaver Road,Troy,MI -48084";
        Employee e = new Employee();
        h1.loadMap();
        System.out.println("Choose the options below:");
        System.out.println("1.Enter 1 to add Employee:");
        System.out.println("2.Enter 2 to remove Employee:");
        System.out.println("3.Enter 3 to Update Employee:");
        System.out.println("4.Enter 4 to display Employee info:");
        System.out.println("5.Enter 5 to display all Employee details:" + "\n");
        Scanner scan = new Scanner(System.in);
        try {
            opr = Integer.parseInt(scan.nextLine());
        }
        catch (NumberFormatException ne)
        {
            System.out.println(" Entered option is not a number");
        }
        finally {
            h1.saveMap();
        }



        switch (opr) {
            case 1:
                try {
                    h1.addEmp(h1.getInput(e, opr));
                    System.out.println("Employee id :" + e.getEmployeeid() + " added");
                    h1.getAllEmpList();
                    }

                finally
                {

                    h1.saveMap();
                }

                break;

            case 2:
                try
                {
                h1.deleteEmp(h1.getInput(e, opr));
                    System.out.println("Employee id :" + e.getEmployeeid() + " details deleted");
                    h1.getAllEmpList();
                }
                finally {


                    h1.saveMap();
                }

                break;
            case 3:

                try
                {
                    h1.updateEmp(h1.getInput(e, opr));
                    System.out.println("Employee id :" + e.getEmployeeid() + " details updated");
                    h1.getAllEmpList();

                }

                finally {

                    h1.saveMap();

                }

                break;

            case 4:
                try {
                    e = h1.getEmp(h1.getInput(e, opr));
                    if (!(e == null)) {
                        System.out.println("Employee id :" + e.getEmployeeid() +" details" );
                        System.out.println(e.toString());

                    }
                }

                    finally
                    {

                        h1.saveMap();
                    }


                break;

            case 5:


                h1.saveMap();
                break;

            default:
                System.out.println(" Option selected is invalid");
                h1.saveMap();

        }



    }

}






