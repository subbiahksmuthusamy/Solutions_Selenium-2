package testjava;
import java.util.Scanner;
public class LoanEligibility {

	public static void main(String[] args) {
		
		String jobStatus = " ";
		int loanamount = 0;
		
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Marital Status: (Single = 1, Married = 2):");
        int relation = scn.nextInt();
        if(relation != 1 && relation !=2)
        {
        	System.out.println("Marital status is not valid");
        	System.exit(0);
        	
        }
        System.out.println("Enter job status as Permanent or Temporary: ");
        jobStatus = scn.next();
        if (!"Permanent".equalsIgnoreCase(jobStatus.trim()) && !"Temporary".equalsIgnoreCase(jobStatus.trim()))
        {
     	   System.out.println("Invalid Job Status entered");
     	   System.exit(0);
        }
        
        System.out.println("Enter years of experience in years: ");
        int yearofexp = scn.nextInt();      
        if (yearofexp < 0 )
        {
        	System.out.println("invalid years of experience");
        	System.exit(0);
        }

        if(jobStatus.equals ("Permanent"))
        {
        	 if(relation == 2)
        	 {
        		 if(yearofexp >= 30)
        		 {
        			 loanamount = 600000;
        		 }
        		 else
        		 {
        			 loanamount = 350000;
        		 }
        	 }
        	 else
        	 {
        		 if(yearofexp >= 30)
        		 {
        			 loanamount = 500000;
        		 }
        		 else
        		 {
        			 loanamount = 250000;
        		 }
        	 }
        
        }
        else if (jobStatus.equals ("Temporary"))
        {
        	loanamount = 100000;
        }
        else
        {
        	loanamount = 0;
        }
        if(loanamount ==0)
        {
        	System.out.println("sorry you are not eligible for loan");
        }
        else
        {
        	System.out.println("you are eligible for loan amount of :" +loanamount);
        }
        
	}

}
