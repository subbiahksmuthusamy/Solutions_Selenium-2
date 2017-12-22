package Assg1;

public class  Loanlogic {

	public Loanlogic(){}
	
	public int Loan(String Mstatus, String jobstatus, int exp)
	{
			int loanamt=0;
				if(jobstatus.equals("Parmanant"))
					  if(Mstatus.equals("Married"))
							if(exp >= 30)
								 loanamt=600000;
							else
								loanamt=350000;
					else 
						if(Mstatus.equals("Unmarried"))
							if(exp >= 30)
								loanamt=500000;
							else 
								loanamt=250000; 
						else 
								loanamt=1;  //invalid Marital status
			else
				if(jobstatus.equals("Temporary"))
					loanamt=100000;	
				else 
							loanamt=2; //invalid job status
			return loanamt;
		
		
	}
}
