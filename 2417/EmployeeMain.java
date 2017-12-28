package subbu.java.test;

import java.util.Scanner;

public class EmployeeMain{
	
	public static void main(String[] args) throws Exception {
		
		int Operation = 0;
				
		Employee Emp1 = new Employee(2417,"Subbiah M",50000.00);
		Employee Emp2 = new Employee(2418,"Suresh M",60000.00);
		Employee Emp3 = new Employee(2419,"Ramesh M",70000.00);
		
		HTCGlobalServices HTC1 = new HTCGlobalServices();
		HTC1.CompanyID = 101;
		HTC1.Address = "Troy, Michigan, USA";
		
		HTC1.CreateEmp(Emp1);
		HTC1.CreateEmp(Emp2);
		HTC1.CreateEmp(Emp3);
		
		boolean EndLoop = true;
		do
		{
		System.out.println("Enter the Operation # as provided \n Create - 1 \n Update - 2 \n Delete - 3 \n Read - 4 \n Exit - 5 Please Enter: ");
		Scanner in = new Scanner(System.in);
		try {
			Operation = in.nextInt();
    //      System.out.println("Entered Option is : " + Operation);
		}
        catch (NumberFormatException ne)
        {
            System.out.println(" Enter an valid Operation");
            break;
        }
		
		switch (Operation) {
		case 1:
			try {
				int EmpID;
				String EmpName;
				double EmpSal;
				
		//		System.out.println("At create Employee");
				System.out.println("Enter the Employee details to Create: ");
				System.out.println("Enter the Employee ID: \n");
				Scanner in2 = new Scanner(System.in);
				EmpID = in2.nextInt();
				System.out.println("Enter the Employee Name: \n");
				Scanner in3 = new Scanner(System.in);
				EmpName = in3.nextLine();
				System.out.println("Enter the Employee Salary: \n");
				Scanner in4 = new Scanner(System.in);
				EmpSal = in4.nextDouble();
				
				Employee Emp4 = new Employee (EmpID,EmpName,EmpSal);
				
				HTC1.CreateEmp(Emp4);
				
				System.out.println("Employee created successfully");
				HTC1.ReadEmpAll();
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			break;
		case 2:
			try {
				int EmpID;
				String EmpName;
				double EmpSal;
				
				HTC1.ReadEmpAll();
				
				System.out.println("Enter the Employee details to Update: ");
				System.out.println("Enter the Employee ID: \n");
				Scanner in2 = new Scanner(System.in);
				EmpID = in2.nextInt();
				System.out.println("Enter the Employee Name: \n");
				Scanner in3 = new Scanner(System.in);
				EmpName = in3.nextLine();
				System.out.println("Enter the Employee Salary: \n");
				Scanner in4 = new Scanner(System.in);
				EmpSal = in4.nextDouble();
				
				Employee Emp4 = new Employee (EmpID,EmpName,EmpSal);
				
			//	Emp3.setSalary(80000.00);
				HTC1.UpdateEmp(Emp4);
				HTC1.ReadEmpAll();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			break;
		case 3:
			try {
				int EmpID;
				HTC1.ReadEmpAll();
				System.out.println("Enter the Employee ID to Delete: ");
				
				Scanner in2 = new Scanner(System.in);
				EmpID = in2.nextInt();
				
				HTC1.DeleteEmp(EmpID);
				HTC1.ReadEmpAll();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				HTC1.ReadEmpAll();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 5:
			System.out.println("Thanks for choosing my Program");
	  		EndLoop = false;
			break;
		default:
			System.out.println("Invalid Operation Entered");
			in.close();
		}
		}while(EndLoop);
	}
}