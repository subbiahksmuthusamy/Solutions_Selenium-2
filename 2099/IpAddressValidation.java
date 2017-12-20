package javaExerciseAlbin;

import java.util.Scanner;

public class IpAddressValidation 
{

	public static void main(String[] args) 
	{

		String IpAddress = " ";
		boolean ValidIP;
		
@SuppressWarnings("resource")
	   	Scanner in = new Scanner(System.in);

	    System.out.println("Enter the IP address to validate");
	    IpAddress = in.nextLine();

// Calling the function to validate IP address by passing the parameter (IP address)	    
	    ValidIP = validateIPaddress(IpAddress);
	    if (ValidIP == true)
	    		System.out.println("It is a valid IP address");
	    else
	    		System.out.println("This is an invalid IP address");
	}	

	
	
// Function to validate the IP address begins here
	private static boolean validateIPaddress(String IpAdd) 
	{
		boolean IpValid = false;
		int IpLen = IpAdd.trim().length();
// Validates the if the IP address is entered or not.		
		if (IpLen<=0)
		{
			System.out.println("Error!! IP Address was not entered");
			return false;
		}
// Validates the length of IP address passed to the function has less than 7 char or more than 15 char		
		else if (IpLen<7||IpLen>15)
		{
			System.out.println("Error!! IP Address length should be minimum 7 and maximum 15");
			return false;
		}
// Validates if the IP address starts or ends with . (dot)		
		else if (IpAdd.startsWith(".") || IpAdd.endsWith("."))
		{
			System.out.println("Error!! IP Address cannot start or end with . (dot) ");
			return false;
		}
		else
		{
			String [] ptArray = IpAdd.split("\\.");
// After splitting the IP address into a String Array (delimiting with .), Checks if the length of the Array has 4.		
			if(ptArray.length!=4)
			{
				System.out.println("Error: There should be 3 dots in IPAddress");
				return false;
			}
			else
			{
// Iterates all the String in the String Array and then Parse each String to Interger to validate it for Int values between 0 to 255				
				for (String str : ptArray)
				{
					int i = Integer.parseInt(str);
						if(i<0 || i>255)
						{
							System.out.println("Error!! IP Address cannot have number less than 0 and greater than 255");
							return false;
						}
						else
						{
							IpValid = true;
						}
				}	
				return IpValid;
			
			}
		}
	}

}
