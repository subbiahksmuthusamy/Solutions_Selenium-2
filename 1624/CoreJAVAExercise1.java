package com.htc.corejava;

public class CoreJAVAExercise1 {

	public static void main(String[] args) {

		boolean married = true;
		String jobType = "Temporary";
		int numberOfYearsOfService = 30;

		CoreJAVAExercise1 coreJAVAExercise1 = new CoreJAVAExercise1();

		//a married temporary job holder
		System.out.println("Condition: a married temporary job holder");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();
		

		//an unmarried temporary job holder
		married = false;
		jobType = "Temporary";
		numberOfYearsOfService = 10;
		System.out.println("an unmarried temporary job holder");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();

		//a temporary job holder with 30 years of service
		married = false;
		jobType = "Temporary";
		numberOfYearsOfService = 30;
		System.out.println("a temporary job holder with 30 years of service");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();
				
		//a married permanent job holder with 30 years of service
		married = true;
		jobType = "Permanent";
		numberOfYearsOfService = 30;
		System.out.println("a married permanent job holder with 30 years of service");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();
		
		//an unmarried permanent job holder with 30 years service
		married = false;
		jobType = "Permanent";
		numberOfYearsOfService = 30;
		System.out.println("an unmarried permanent job holder with 30 years service");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();
		
		//a married permanent job holder with 25 years service.
		married = true;
		jobType = "Permanent";
		numberOfYearsOfService = 25;
		System.out.println("a married permanent job holder with 25 years service");
		System.out.println("Loan Amount: " + coreJAVAExercise1.calculateLoanAmount(married, jobType, numberOfYearsOfService));
		System.out.println();

	}

	private int calculateLoanAmount(boolean married, String jobType,int numberOfYearsOfService) {
		int loanAmt = 0;

		if(jobType.equalsIgnoreCase("Permanent")) {
			if(married) {
				if(numberOfYearsOfService < 30) {
					loanAmt=350000;
				}
				else {
					loanAmt=600000;
				}

			}else {
				if(numberOfYearsOfService < 30) {
					loanAmt=250000;
				}
				else {
					loanAmt=500000;
				}
			}

		}else {
			loanAmt = 100000;
		}

		return loanAmt;
	}
}
