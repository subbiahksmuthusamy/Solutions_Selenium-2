package subbu.jave.test;

import java.util.Scanner;

class Employee {
	
	boolean isMarried = true;
	boolean isTemp = true;
	int LoanAmt;

	void LoanEligibility(boolean isMarried, boolean isTemp, int Service) {
		this.isMarried = isMarried;
		this.isTemp = isTemp;
		if (this.isMarried) { 
			if (this.isTemp){ 
				if (Service >=30 ) {
					LoanAmt = 100000;
					System.out.println("Congrats Mar Temp, You are Sanctioned for Loan Amount: " + LoanAmt);
				}else {
					System.out.println("Sorry, Temporary job holder less than 30 years is not eligible for loan");
				}
			}else {
				if (Service >=30 ) {
					LoanAmt = 600000;
					System.out.println("Congrats, You are Sanctioned for Loan Amount: " + LoanAmt);
				}else {
					LoanAmt = 350000;
					System.out.println("Congrats, You are Sanctioned for Loan Amount: " + LoanAmt);
				}
			}
		}else if (this.isTemp){
					if (Service >=30 ) {
						LoanAmt = 100000;
						System.out.println("Congrats, Unm Temp You are Sanctioned for Loan Amount: " + LoanAmt);
					}else {
						System.out.println("Sorry, Temporary job holder less than 30 years is not eligible for loan");
					}
				}else {
					if (Service >=30 ) {
						LoanAmt = 500000;
						System.out.println("Congrats, You are Sanctioned for Loan Amount: " + LoanAmt);
					}else {
						LoanAmt = 250000;
						System.out.println("Congrats, You are Sanctioned for Loan Amount: " + LoanAmt);
					}
			}
	}
}


public class CoreJavaTest1{
	public static void main(String[] args) {
		boolean Married;
		boolean Temp;
		int Serv;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Are you Married (true/false): ");
		Married = in.nextBoolean();
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("Are you Temporary Employee (true/false): ");
		Temp = in2.nextBoolean();
		
		Scanner in3 = new Scanner(System.in);
		System.out.print("How much is your Service: ");
		Serv = in3.nextInt();
		
		Employee obj1 = new Employee();
		
		obj1.LoanEligibility(Married, Temp, Serv);
		in.close();
		in2.close();
		in3.close();
	}
}

