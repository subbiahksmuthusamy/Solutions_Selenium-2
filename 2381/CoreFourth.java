package excercise.core;

/*Write a function validateIPaddress that accepts an ipAddress (string) as an input and does the following validations(Strings & functions)
(a) Length should be minimum 7 and maximum 15
(b) Should not start and end with dot
(c) Should have exactly 3 dots
(d) Dots should not be in consecutive positions.
(e) Should not permit alphabets and special characters*/

public class CoreFourth {

	public static void main(String[] args) {
		boolean valid_ip = false;
		String ip_address = "";
		
		Internet_Protocol ip = new Internet_Protocol();
		ip_address = "192.255.1.255";
		
		valid_ip = ip.check_address(ip_address);
		System.out.println("Entered IP Address : " + ip_address + " - is " + ((valid_ip) ? "Valid" : "Invalid"));
	}
}
	
class Internet_Protocol {
	public boolean check_address(String ip_address) {
		
		// Check if the length of IP Address is within 7 to 15 length
		if (ip_address.length() < 7 || ip_address.length() > 15) { return false; }
		
		// Verify IP Address does not start or end with a dot
		else if (ip_address.startsWith(".") || ip_address.endsWith(".")) { return false; }
		
		else {
			int dot_cnt = 0, dot_pos = 0;
			String ip_remain = ip_address;
			
			// Get the dot position to verify the input.
			dot_pos = ip_remain.indexOf(".");
			
			//While condition will make sure the ip address does not have consecutive dots and the does not have more than 3 numbers between dots.
			while (dot_pos > 0 && dot_pos < 4) {
				
				// Count the number of dots that occurs, to verify if we will get three at the end.
				dot_cnt++;

				// Verify input does not contain Alphabets or invalid characters
				int sub_val = Integer.parseInt(ip_remain.substring(0,dot_pos));
				if (sub_val < 0 || sub_val > 255) { return false; }
				
				// Parse the IP Address for each dot and verify remaining value each time
				ip_remain = ip_remain.substring(dot_pos + 1);
				
				dot_pos = ip_remain.indexOf(".");
			};
			
			// Below IF condition would verify if the last set of number after last dot does not contain more than 3 numbers
			if (ip_remain.length() > 3 || Integer.parseInt(ip_remain) < 0 || Integer.parseInt(ip_remain) > 255) { return false; }
			
			// Verify if we have exactly three dots. Return false if it does not.
			return (dot_cnt == 3) ? true : false;
		}
	}
}
