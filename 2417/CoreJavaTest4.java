package subbu.jave.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoreJavaTest4 {
	
	String IPAddress;
	boolean isTrue;
		
	void validateIPaddress(String IP) {
		if (IP.length() >= 7 && IP.length() <= 15) {
			if (!IP.startsWith(".") && !IP.endsWith(".")) {
				isTrue = checkSpec(IP);
				if (isTrue != true) {
			//		System.out.println("Index sequence is: " + IP.charAt(0));
					isTrue = checkDot(IP);
					if (isTrue != true) {
						System.out.println("IP address "+IP+" is correct");
					}
					else {
						System.out.println("IP address "+IP+" contains invalid Dots");
					}
					}
				else {
					System.out.println("IP address "+IP+" contains Characters or Special characters");
				}
			}else {
				System.out.println("IPAddress "+IP+" should not Start or End with dot");
			}
		}
		else {
			System.out.println("IPAddress "+IP+" should be greater than 7 and less than 15");
		}
	}
			


	boolean checkDot(String iP) {
		int i;
		int j = iP.length();
		int k = 0;
		int dotCount = 0;
		char check1 = 0;
		char check2 = 0;
		boolean isTrue;
		
	//	System.out.println("Length of j is: " + j);
	//	System.out.println("index of String: " + iP.indexOf(iP));
		for (i=0; j >= i; i++) {
			if (i >= j) {
				break;	
			}
			
			check1 = iP.charAt(i);
			k++;
			if (k < j) {
				check2 = iP.charAt(k);
				if (check1 == check2) {
		//			System.out.println("Consecutive dot found");
					isTrue = true;
					return isTrue;
				}
		//		System.out.println("Value of i: " + iP.charAt(i));
		//		System.out.println("Value of k: " + iP.charAt(k));
			}
			
			if (check1 == '.') {
				++dotCount;
			}
						
		}
		if ( dotCount> 3 || dotCount < 3) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		return isTrue;
	}



	boolean checkSpec(String iP) {
		Pattern pattern = Pattern.compile("[0-9.]*");
		Matcher matcher = pattern.matcher(iP);
		
		if (!matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		CoreJavaTest4 obj1 = new CoreJavaTest4();
		obj1.validateIPaddress("68.180.94210");
	}
}
