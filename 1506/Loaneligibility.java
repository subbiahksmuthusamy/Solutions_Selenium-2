package com.test;

import java.util.Scanner;

public class Loaneligibility {

	public void validateloan(boolean mar, boolean per, int ex)
	{
		if (per == true)
		{
			if (mar == true)
			{
				if (ex >= 30)
				{ 
					System.out.println("your loan amount is 600000");
				}
				else
				{
					System.out.println("your loan amount is 350000");
				}
			}
				
			else
			{
				if (ex >= 30)
				{ 
					System.out.println("your loan amount is 500000");
				}
				else
				{
					System.out.println("your loan amount is 250000");
				}
						
			}
		}
		
		else
		{
			System.out.println("your loan amount is 100000");
		}
		
	}
	

	public static void main(String[] args) {
		boolean married;
		boolean permenent;
		int exp;
		Scanner mscan = new Scanner(System.in);
		System.out.println("Are you Married true/false");
		married = mscan.nextBoolean();
		
		Scanner pscan = new Scanner(System.in);
		System.out.println("Are you permenent employee true/false");
		permenent = pscan.nextBoolean();
		
		Scanner escan = new Scanner(System.in);
		System.out.println("what is your years of experience?");
		exp= escan.nextInt();
		
		Loaneligibility obj1 = new Loaneligibility();
		obj1.validateloan(married, permenent, exp);
							

	}

}
