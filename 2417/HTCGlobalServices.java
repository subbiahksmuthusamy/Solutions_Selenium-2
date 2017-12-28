package subbu.java.test;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;

public class HTCGlobalServices implements ICompanysearchprovider{
	
	public int CompanyID;
	public String Address;
	HashMap<Integer, Employee> EmployeeMap = new HashMap<Integer,Employee>();
	
	
	@Override
	public void CreateEmp(Employee e) throws Exception {
		// TODO Auto-generated method stub
		
		if(!EmployeeMap.containsKey(e.getEmployeeID())){
			if (e.getSalary() > 0) {
			EmployeeMap.put(e.getEmployeeID(), e);
			}else {
				throw new InvalidSalaryException(e.getSalary());
			}
		}
		else {
			throw new DuplicateEmployeeException(e.getEmployeeID());
		}
		
		
	}

	@Override
	public void UpdateEmp(Employee e) throws Exception {
		// TODO Auto-generated method stub
		if (EmployeeMap.containsKey(e.getEmployeeID())) {
			if (e.getSalary() > 0) {
				EmployeeMap.replace(e.getEmployeeID(), e);
				System.out.println("Employee details Updated successfully");
				}else {
					throw new InvalidSalaryException(e.getSalary());
				}
		}
		else {
			throw new EmployeeNotAvailableexception(e.getEmployeeID());
		}
	}

	@Override
	public void DeleteEmp(int EID) throws Exception {
		// TODO Auto-generated method stub
		if (EmployeeMap.containsKey(EID)) {
			EmployeeMap.remove(EID);
			System.out.println("Employee is Successfully deleted");
		}
		else {
			throw new EmployeeNotAvailableexception(EID);
		}
	}

	@Override
	public void ReadEmp(int EID) throws Exception {
		// TODO Auto-generated method stub
		if (EmployeeMap.containsKey(EID)) {
			System.out.println(EmployeeMap);
			
		}
		else {
			throw new EmployeeNotAvailableexception(EID);
		}
		
		
	}

	public void ReadEmpAll() throws Exception{
		
		for (Map.Entry<Integer,Employee> entry: EmployeeMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	
}
