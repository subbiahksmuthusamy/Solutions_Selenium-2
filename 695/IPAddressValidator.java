package CoreJavaConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IPAdd="10.101.90.10A";
		
		boolean IPAddFormat= ValidateIPaddressUsingPattern(IPAdd);
		
		if (IPAddFormat) System.out.println("Format of IP address is correct");
		else System.out.println("Format of IP address is incorrect");
		
		
		ValidateIPaddress(IPAdd);
		
		
		
	}

	
	public static void ValidateIPaddress(String IPAddress) {
		
		if ((IPAddress.length()<7)||(IPAddress.length()>15)) 
			System.out.println("IP Address Length should be minimum 7 and maximum 15");
		
		
		if ((IPAddress.charAt(0)=='.') || (IPAddress.charAt((IPAddress.length()-1))=='.'))
			System.out.println("IP Address Should not start and end with dot");
		
		
	/*	for(int i=0;i<IPAddress.length();i++) {
			if (Character.isLetter(IPAddress.charAt(i))) 
				System.out.println("IP Address Should not permit alphabets and special characters");
		}*/		
		
		int countdots=0;		
		for(int j=0;j<IPAddress.length();j++) {
				if ((IPAddress.charAt(j)=='.')) 
					countdots++;										
		}
		
		if (countdots!=3)
			System.out.println("IP Addresss should have exactly 3 dots");
		
		boolean consectivedots=false;	
		int dotplace=0;
		for(int k=0;k<IPAddress.length();k++) {
				if ((IPAddress.charAt(k)=='.') && consectivedots && k==dotplace+1) 
				{
					System.out.println("IP Addresss should not contain consective dots");
				}
				else if (IPAddress.charAt(k)=='.')
				{
				consectivedots=true;	
				dotplace=k;
				}
				else
					consectivedots=false;
				
		}
		
		
		Pattern p = Pattern.compile("[^0-9.]");
		
		Matcher m = p.matcher(IPAddress);
		boolean b = m.find();
		
		if (b)
		System.out.println("IP Address Should not permit alphabets and special characters");
		
	}
		
		public static boolean ValidateIPaddressUsingPattern(String IPAddress) {
		
			 
			 String IPADDRESS_PATTERN =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
			 
			 
			boolean b;
			b=Pattern.compile(IPADDRESS_PATTERN).matcher(IPAddress).matches();
			
			
			  return b;

		
		
		
		
	}
}
