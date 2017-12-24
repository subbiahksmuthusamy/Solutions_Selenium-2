package com.htc.corejava;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise3 exercise3 = new Exercise3();
		int arr[] = {3, 1, 2, 24, 21, 90, 12, 33, 28, 99, 150,133,30,15,81};
		int searchKey=1000;
		
		//Count the number of odd numbers divisible by 3 in even positions.
		System.out.println("The number of odd numbers divisible by 3 in even positions = " + exercise3.oddNumberCounter(arr));
		
		//Search for a key value in array and print it is available in the array or not.
		searchKey=81;
		if(exercise3.searchKeyInArray(arr,searchKey) == false) {
			System.out.println("The Search Key " + searchKey + " is not available in array.");
		}
		
		//Search for a key value in array and print it is available in the array or not.
		searchKey=1000;
		if(exercise3.searchKeyInArray(arr,searchKey) == false) {
			System.out.println("The Search Key " + searchKey + " is not available in array.");
		}
		
		//Count the number of prime numbers.
		exercise3.countPrimeNumber(arr);
	}
	
	private int oddNumberCounter(int[] arr) {
		int count=0;
		
		for(int i=0;i < arr.length; i++) {
			if(arr[i] % 2 != 0 && arr[i] % 3 == 0 && i % 2 == 0) {
				//System.out.println(arr[i]);
				count++;	
			}
			
		}
		return count;
	}

	private boolean searchKeyInArray(int[] arr,int searchKey) {
		boolean flag=true;
		for(int i=0;i < arr.length; i++) {
			if(arr[i] == searchKey) {
				System.out.println("The Search Key " + searchKey + " is available in array at position "+ i);
				flag=true;
			}
			else
			{
				flag=false;
			}
				
		}
		return flag;
	}
	
	private boolean isPrime(int n) {
	    int i;
	    
	    for (i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	
	private void countPrimeNumber(int[] arr) {
		int count=0;
		
		for(int arrVal : arr) {
			if(isPrime(arrVal)) {
				count++;
			}
		}
		
		System.out.println("Total number of prime numbers in aarray = " + count);

	}
}
