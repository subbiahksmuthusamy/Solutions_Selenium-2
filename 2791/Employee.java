
public class Employee {

		public static void main(String[] args) {
		
		
		LoanEligiblity loancheck=new LoanEligiblity();
		int loanamount=loancheck.LoanAmtCalc("single", "Permanent", 45);
		
		if(loanamount==1)
			System.out.println("Error: Please enter valid marital status to Calc load Eligibility");
		else
			if (loanamount==0)
				System.out.println("Error: Please enter valid job status to Calc load Eligibility");
			else	
				System.out.println("Loan Amount eligible:" + loanamount);
		
		
	}
	
}
