package Assg1;

public class loaneligibility {
	
	public static void main(String[] args) {
		int loanamount=0;
		Loanlogic obj1 = new Loanlogic();
		loanamount=obj1.Loan("Unmarried","Parmanant",0);
		if(loanamount == 1)
			System.out.println("invalid Marital status");
		else
			if(loanamount == 2)
				System.out.println("invalid Job status");
			else
				System.out.println("you are Eligible for "+loanamount);
		
		
	}

}
