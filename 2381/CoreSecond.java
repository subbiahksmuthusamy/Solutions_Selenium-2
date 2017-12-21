package excercise.core;

/* Prepare the logic for the below series
(a) 1, -3, 5, -7....
(b) 1/1, 1/2, 1/3, 1/4.... */

public class CoreSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num = 1;
		int val = 10;
		boolean negative = false;
		String first_output = "", second_output = "";
		
		//Question: Prepare the logic for 1, -3, 5, -7....
		for (int i = 1; i<=val; i=i+2) {
			if (i%2 == 1) {
				if (negative) {
					first_output = first_output + Integer.toString((i*-1)) + " ";
					negative = false;
				}
				else if (!negative) {
					first_output = first_output + Integer.toString((i)) + " ";
					negative = true;
				}
			}
		}
		System.out.println("First Set Output :" + first_output);
		
		//Question: Prepare the logic for 1/1, 1/2, 1/3, 1/4....
		for (int i = 1; i<=val; i++) {
			second_output = second_output + num + "/" + Integer.toString(i) + " ";
			//System.out.println("Second Set Output : " + num + "/" + i);
		}
		System.out.println("Second Set Output : " + second_output);

	}

}
