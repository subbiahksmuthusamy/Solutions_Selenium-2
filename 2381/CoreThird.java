package excercise.core;

/*Consider an array and perform the below operations
(a) Count the number of odd numbers divisible by 3 in even positions.
(b) Search for a key value in array and print it is available in the array or not.
(c) Count the number of prime numbers.*/

import java.util.Arrays;

public class CoreThird {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int odd_count = 0, divisible_count = 0;
		String odd_cnt = "", divisible_cnt = "";
		System.out.println("Input Array : " + Arrays.toString(arr));
		
		//Question: Count the number of odd numbers divisible by 3 in even positions
		for (int i:arr) {
			if (i%2 == 1) {
				odd_count++;
				odd_cnt = odd_cnt + Integer.toString(i) + " ";
				if (i%3 == 0) {
					divisible_count++;
					divisible_cnt = divisible_cnt + Integer.toString(i) + " ";
				}
			}
		}
		System.out.println("Count of Odd Numbers : " + odd_count + " ( " + odd_cnt + ")");
		System.out.println("Count of Odd Numbers divisible by 3 : " + divisible_count + " ( " + divisible_cnt + ")\n");
		
		//Question : Search for a key value in array and print it is available in the array or not
		for (int i:arr) {
			if (i == 5) {
				System.out.println("Search for number 5 in array successful\n");
			}
		}
		
		//Question : Count the number of prime numbers
		int upper_limit = 20, prime_count;
		String prime_display = "";
		for (int i=1; i<upper_limit; i++) {
			prime_count = 0;
			for (int j=1; j<=i; j++) {
				if (i%j == 0) {
					prime_count++;
					if (prime_count > 2) {
						break;
					}
				}
			}
			if (prime_count == 2) {
				prime_display = prime_display + Integer.toString(i) + " ";
			}
		}
		System.out.println("Prime Number from 1 to " + upper_limit + ": " + prime_display);
	}
}
