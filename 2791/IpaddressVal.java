import java.util.Scanner;


public class IpaddressVal {

	public void validateIPaddress(String ipAddress){
		int count=0,notValid=0;
		String specialCharacters=" !#$%&'()*+,-/:;<=>?@[]^_`{|}~";

		String[] charHandling=new String[ipAddress.length()];
		
		for(int i=0;i<ipAddress.length();i++)
		{
			charHandling[i]=Character.toString(ipAddress.charAt(i));
		}
		
		for(int i=0;i<ipAddress.length();i++)
		{
			if(specialCharacters.contains(charHandling[i]))
			{
				count++;
			}
		}
		//Should not permit alphabets & special characters
		if(count==0 && !ipAddress.matches(".*[a-zA-Z]+.*"))
		{
			//minimum 7 & maximum 15
			if(ipAddress.length()>6 || ipAddress.length() <16)
				//should not start & end with dot
				if(!ipAddress.startsWith(".") && !ipAddress.endsWith("."))
					{
					for(int i=0;i<ipAddress.length();i++)
					{
						if(ipAddress.charAt(i)== '.')
						{
							count++;
							if(ipAddress.charAt(i-1)== '.' && notValid==0)
							{
								System.out.println("ipAddress should not contain dots consecutively");
								notValid=1;
							}
						}
					}
					if (count<=3 && notValid==0)
					{
						System.out.println("ipAddress is validated & good to use");
					}	
					else if(notValid==0)
						System.out.println("ipAddress should not contain more than 3 dots");
				}
				else
					System.out.println("ipAddress should not start & end with dot");
			else
				System.out.println("ipAddress should be Minimum 7 and maximum 15 characters");
		}
		else
			System.out.println("ipAddress cannot contain Alphabets or Special characters");

				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter Ipaddress:");
		String ipAddress1= scan.next();
		scan.close();
		
		IpaddressVal obj1=new IpaddressVal();
		obj1.validateIPaddress(ipAddress1);
		
	}

}
