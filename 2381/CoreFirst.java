package excercise.core;

/*Implement the following logic to arrive at the loan eligibility for an employee:
(a) For an unmarried permanent job holder, if the service has been for 30 years or more,the loan amount is Rs.500,000; otherwise the loan amount is Rs.250,000
(b) For a married permanent job holder, if the service has been for 30 years or more, the loan amount is Rs.600,000; otherwise the loan amount is Rs.350,000
(c) For temporary job holder, the loan amount is Rs.100,000.

Check the loan eligibility with the following input conditions.
(a) a married temporary job holder
(b) an unmarried temporary job holder
(c) a temporary job holder with 30 years of service
(d) a married permanent job holder with 30 years of service
(e) an unmarried permanent job holder with 30 years service
(f) a married permanent job holder with 25 years service.*/

public class CoreFirst {

	public static void main(String[] args) {
		Loan loanObj = new Loan();
		loanObj.check_eligibility("married", "temporary", 2);
		loanObj.check_eligibility("unmarried", "temporary", 3);
		loanObj.check_eligibility("married", "temporary", 30);
		loanObj.check_eligibility("married", "permanent", 30);
		loanObj.check_eligibility("unmarried", "permanent", 30);
		loanObj.check_eligibility("married", "permanent", 25);
	}
}

class Loan {
	private int loan_amount = 0;
	// Eligibility Check would take below inputs
	// Marital Status	(STRING) 	('married' or 'unmarried')
	// Job Type 		(STRING)	('permanent' or 'temporary')
	// Service Period	(INT)		(Number of years serviced)
	public void check_eligibility(String marital_status, String job_type, int service_period) {
		
		// Check for valid inputs
		if (job_type.toLowerCase() != "permanent" && job_type.toLowerCase() != "temporary") {
			System.out.println(job_type.toLowerCase() + "Invalid Job Type Entered.  Please provide correct Job Type!!");
		}
		if (marital_status.toLowerCase() != "married" && marital_status.toLowerCase() != "unmarried") {
			System.out.println("Invalid Marital Status Entered.  Please provide correct Marital Status!!");
		}
		if (service_period < 0) {
			System.out.println("Invalid Service Period Entered.  Please provide correct Service Period!!");
		}
		
		// Check for loan eligibility
		
		if (job_type == "permanent" && marital_status == "unmarried" ) {
			loan_amount = (service_period >= 30) ? 500000 : 250000;
		}
		else if (job_type == "permanent" && marital_status == "married" ) {
			loan_amount = (service_period >= 30) ? 600000 : 350000; 
		}
		else if (job_type == "temporary" ) {
			loan_amount = 100000;
		}
		
		// Print Loan Eligibility Information
		System.out.println("Loan Amount Eligibility for " + marital_status + " " + job_type + " job holder with " + service_period + " years of service : " + loan_amount );
	}
}