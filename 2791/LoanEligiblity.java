
public class LoanEligiblity {

	private int loanAmount;
		
	public LoanEligiblity(){}
	
	public int LoanAmtCalc(String maritalStatus, String jobType, int yearsService){
			if (jobType.equals("Permanent"))
				if(maritalStatus.equals("Married"))
					if (yearsService >= 30)
						loanAmount=600000;
					else
						loanAmount=350000;
				else if (maritalStatus.equals("Single"))
						if (yearsService >= 30)
							loanAmount=500000;
						else
							loanAmount=250000;
				else
					loanAmount=1;
			else if (jobType.equals("Temporary"))
					loanAmount=100000;
			else 
				loanAmount=0;
			
			return loanAmount;
	}


}
