package subbu.java.test;

public interface ICompanysearchprovider {
	
	public void CreateEmp(Employee e) throws Exception;
	public void UpdateEmp(Employee e) throws Exception;
	public void DeleteEmp(int EID) throws Exception;
	public void ReadEmp(int EID) throws Exception;
	
}
