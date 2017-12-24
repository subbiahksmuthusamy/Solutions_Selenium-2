package test.com;


public  interface ICompanyServiceProvider {
    public void  addEmp(Employee e) throws Exception;
    public void deleteEmp(Employee e) throws Exception;
    public void updateEmp(Employee e) throws  Exception;
    public Employee getEmp(Employee e) throws  Exception;
    public boolean getAllEmpList();

}
