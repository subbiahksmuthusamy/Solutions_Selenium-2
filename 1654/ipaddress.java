/* Ipaddress validation
It trims any prefix or suffix spaces and does not remove spaces in between before validating
This solution is without using regular expressions!

 */

import java.util.*;

public class ipaddress {
    private  String ipaddressString;
    private  boolean isQualityGood;
    private String infoMessage;

    public void setIpaddress()
    {
        System.out.println("Enter IP address below:");
        Scanner scan = new Scanner(System.in);
        ipaddressString = scan.nextLine().trim();
    }


    public boolean validateIpaddress()
    {
        String validData="012345679.";
        isQualityGood = false;
        int dotCount;

        dotCount= ipaddressString.length() - ipaddressString.replace(".", "").length();


        if (ipaddressString == null || ipaddressString.isEmpty())
        {
            infoMessage="Ip address entered is empty";
        }
        else if (ipaddressString.length() < 7 || ipaddressString.length() > 15)
        {
            infoMessage="Ip address entered is less than 7 characters or more than 15 characters";
        }
        else if (ipaddressString.startsWith(".") || ipaddressString.endsWith("."))
        {
            infoMessage="Ip address string should not start or end with dot(.)";
        }

        else if (ipaddressString.contains(".."))
        {
            infoMessage="Ip address contains continues dot(.) characters";

        }
        else if (dotCount != 3)
        {
            infoMessage ="IP address should have 3 dots ";
        }
        else
        {

            for (int i=0;i< ipaddressString.length();i++)
            {

                if (validData.indexOf(ipaddressString.charAt(i)) >= 0)
                {
                    isQualityGood = true;
                    infoMessage="IP address is valid!";
                }
                else
                {
                    infoMessage="Ip address contains invalid characters other than numbers and dots(.)";
                    isQualityGood = false;
                    return isQualityGood;

                }

            }


        }
        return isQualityGood;
    }


    public static void main(String[] args) {
        ipaddress ip1 = new ipaddress();
        ip1.setIpaddress();
        ip1.validateIpaddress();
        System.out.println(ip1.infoMessage);
        System.out.println("IP address entered:" + ip1.ipaddressString);
    }

}
