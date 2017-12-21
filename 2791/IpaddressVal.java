import java.util.Scanner;


public class IpaddressVal {

	public void validateIPaddress(String ipAddress){
		int count=0;
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
					}
				}
				if (count<=3)
				{
					System.out.println("ipAddress ok");
				}	
				else
					System.out.println("ipAddress should not contain more than 3 dots");
			}
				
			else
				System.out.println("ipAddress should not start & end with dot");
		else
			System.out.println("ipAddress should be Minimum 7 and maximum 15 characters");
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
