package CoreJavaConcepts;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1, 3, 6, 7, 9, 11, 12, 17, 18, 20, 23};
		int c=0;
		int pn=0;
				
	  //(a) counting number of odd numbers divisible by 3 in even positions
		 System.out.println("\n(a) counting number of odd numbers divisible by 3 in even positions");
	   c=countoddnumberdivby3atevenpositions(num);		
	   System.out.println("Count of odd number divisible by 3 at even positions: "+c);
	   
	 //(b) Search for a key value in array and print it is available in the array or not.
	   System.out.println("\n(b) Search for a key value in array and print it is available in the array or not.");
		   FindKeyValue(num, 3);
		   FindKeyValue(num, 17);
		   FindKeyValue(num, 13);
		   
	 //(c) SCount number of Prime Numbers in Array
		   System.out.println("\n(c) Count number of Prime Numbers in Array");
		   pn=CountPrimeNumbers(num);		   
		   System.out.println("Count number of Prime Numbers in Array : "+pn);
			  
	}

	
	
	public static int countoddnumberdivby3atevenpositions(int arr[]) {
		int count=0;
	   for (int i=2; i<arr.length; i=i+2)
	   {
		   if (arr[i] % 3 == 0) {
			   System.out.println("arr["+i+"]"+arr[i]);
			   count=count+1;
		   }
	   }
	      return count;
	   }

	
	public static void FindKeyValue(int arr[], int val) {
		 boolean ispresent=false;
		for (int i=0; i<arr.length; i++)
	   {
		  
		   if (arr[i]  == val) {
			 System.out.println("KeyValue passed "+val+" is avaiable in array at position "+"arr["+i+"]");
		  	ispresent=true;	
		  	break;
		   }
	   }
	   
	   if(ispresent==false)
			 System.out.println("KeyValue passed "+val+" is NOT avaiable in array ");
		  
	 	}

	public static int CountPrimeNumbers(int arr[]) {
		int count=0;
	   for (int i=0; i<arr.length; i++)
	   {
			   
			   
			   int maxFactor = (int)Math.sqrt(arr[i]);
			   
			   boolean isPrime = true;  // boolean flag to indicate whether number is a prime
		         for (int factor = 2; factor <= maxFactor; ++factor) {
		            if (arr[i] % factor == 0) {   // Factor?
		               isPrime = false;   // number is not a prime
		               break;   // A factor found, no need to search for more factors
		            }
		         }
		         if (isPrime)  { 
		        	 System.out.println("arr["+i+"]"+arr[i]);
			   count=count+1;
		         }
		   }
	   
	      return count;
	   }


}


