package javaExerciseAlbin;

import java.util.Scanner;

public class LoanEligibility {

public static void main(String[] args){

	int loanAmt = 0;
	int jobExperiance = 0, jobExp = 0;
	String jobStatus, marritalStatus;
	jobStatus = " ";
	marritalStatus = " ";
	boolean marriedStatus = false;

	
   @SuppressWarnings("resource")
Scanner in = new Scanner(System.in);

// Gets the Job Status as input
   System.out.println("Enter the Job Status: Permanent / Temporary");
   jobStatus = in.nextLine();

   // Validates the input entered for Job Status: if it is invalid, it exit the pgm.   
   if (!"permanent".equalsIgnoreCase(jobStatus.trim()) && !"temporary".equalsIgnoreCase(jobStatus.trim()))
   {
	   System.out.println("Invalid Job Status entered");
	   System.exit(0);
   }

// Gets the Marrital Status as input   
   System.out.println("Enter the Marrital Status: Married / UnMarried");
   marritalStatus = in.nextLine();

   // Validates the marrital Status: if it is invalid, Alerts and exit the pgm.
   if (!"married".equalsIgnoreCase(marritalStatus.trim()) && !"unmarried".equalsIgnoreCase(marritalStatus.trim()))
   {
	   System.out.println("Invalid Marrital Status entered");
	   System.exit(0);
   }

// Gets the Job Experience in years   
   System.out.println("Enter the Job Experience in no. of Years");
   jobExp = in.nextInt();
   
   // Validates if the jobExperiance is in negative
   if (jobExp < 0)
   {
	   System.out.println("Invalid Job Experiance entered: Job Experiance cannot be in negative");
	   System.exit(0);
   }
   else jobExperiance = jobExp;
   
   
   if ("married".equalsIgnoreCase(marritalStatus.trim()))
	   marriedStatus = true; 
   else if ("unmarried".equalsIgnoreCase(marritalStatus.trim()))
	   marriedStatus = false;
   else
   {
	   System.out.println("Invalid Marrital status entered");
	   System.exit(0);
   }
   
   
   if ("permanent".equalsIgnoreCase(jobStatus.trim()) && marriedStatus == true)
	   {
			   if (jobExperiance >= 30)
				   loanAmt = 600000;
			   else
				   loanAmt = 350000;
	   }
   else if ("permanent".equalsIgnoreCase(jobStatus.trim()) && marriedStatus == false)
   {
	   if (jobExperiance >= 30)
		   loanAmt = 500000;
	   else
		   loanAmt = 250000;
   }
   else if ("temporary".equalsIgnoreCase(jobStatus.trim()))
	   loanAmt = 100000;
   else 
	   loanAmt = 0;

   if (loanAmt == 0)
	   System.out.println("Sorry!!, You are not eligible for this Loan");
   else
   {   
   System.out.println("Your Loan Eligiblity amount is " + loanAmt);
   }
}
}
