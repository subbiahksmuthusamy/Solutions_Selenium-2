package javaExerciseAlbin;

public class LogicSeries {

	public static void main(String[] args) {

		int i = 1, j = 1;
		
		boolean sign = true;
	
		
		System.out.println("\n_______________First Series______________________________________\n");
		
		// Logic, if the sign is positive, it prints the value of i and switches the sign to negative.
		// And increment the value of i by 2
		for (i=1; i<=100;)
		{

			if(sign == true)
			{
				System.out.print(i +", ");
				sign = false;
				i = i + 2;
			}
			else if(sign == false)
			{
				System.out.print("-" + i +", ");
				sign = true;
				i = i + 2;
			}
			else
				System.exit(0);
		}
	
		System.out.println("\n \n \n _____________Second Series______________________________________\n");
		
		// Logic, increments the j value in the denominator and prints.
		for (j=1; j<=30; j++)
		{
			System.out.print(" 1/" + j +", ");
		}
	}

}
