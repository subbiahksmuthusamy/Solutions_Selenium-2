package CoreJavaConcepts;

public class LoanEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int loanAmt;
		  
	      loanAmt=CheckLoanEligibilityAmount('T',true, 1);
	      System.out.println("Loan Eligiblity for  a married temporary job holder : "+loanAmt);
   
	      loanAmt=CheckLoanEligibilityAmount('T',false, 1);
	      System.out.println("Loan Eligiblity for an unmarried temporary job holder: "+loanAmt);
	      
	      loanAmt=CheckLoanEligibilityAmount('T',true, 30);
	      System.out.println("Loan Eligiblity for a temporary job holder with 30 years of service: "+loanAmt);

	      loanAmt=CheckLoanEligibilityAmount('P',true, 30);
	      System.out.println("Loan Eligiblity for a married permanent job holder with 30 years of service: "+loanAmt);  
	      
	      loanAmt=CheckLoanEligibilityAmount('P',false, 30);
	      System.out.println("Loan Eligiblity for ) an unmarried permanent job holder with 30 years service: "+loanAmt);  
	      
	      loanAmt=CheckLoanEligibilityAmount('P',true, 25);
	      System.out.println("Loan Eligiblity for a married permanent job holder with 25 years service: "+loanAmt);  

	      loanAmt=CheckLoanEligibilityAmount('P',false, 15);
	      System.out.println("Loan Eligiblity for permanent unmarried jobholder with 15 years of service: "+loanAmt);  
	      
	}
	
	public static int CheckLoanEligibilityAmount(char job_type, boolean m_status, int exp) {
	      
		int amt=0;
		
		if (job_type=='T' ) {
			amt= 100000;
		}
		
		 if (job_type=='P' && m_status==false) {
			 
			 if (exp>=30) 
				 amt= 500000; 
			  else 
				 amt= 250000;
			 }
				 
			
			 
			 if (job_type=='P' && m_status==true) 
			 {
				 
				 if (exp>=30) 
					 amt= 600000; 
				 
				 else 
					 amt= 350000;
				 
			 
		 }
			
		
		
		return amt;
	   }
	}

