
import java.util.Scanner;

//1.) Implement the following logic to arrive at the loan eligibility for an employee:
//        (a) For an unmarried permanent job holder, if the service has been for 30 years or more,the loan
 //       amount is Rs.500,000; otherwise the loan amount is Rs.250,000
 //       (b) For a married permanent job holder, if the service has been for 30 years or more, the loan
 //       amount is Rs.600,000; otherwise the loan amount is Rs.350,000
 //       (c) For temporary job holder, the loan amount is Rs.100,000.
 //       Check the loan eligibility with the following input conditions.
//        (a) a married temporary job holder
//        (b) an unmarried temporary job holder
//        (c) a temporary job holder with 30 years of service
//        (d) a married permanent job holder with 30 years of service
//        (e) an unmarried permanent job holder with 30 years service
 //       (f) a married permanent job holder with 25 years service.//

public class Loan {
    private String maritalStatus;
    private String jobType;
    private int serviceYears;
    private int loanAmount;
    boolean isEligibleforloan;

/*Get input data and check if it has valid values */
    public boolean getDetails() throws NumberFormatException {
        System.out.println("Enter marital Status:");
        Scanner scan = new Scanner(System.in);
        maritalStatus = scan.nextLine().trim();
        System.out.println("Enter job type:");
        jobType = scan.nextLine().trim();
        System.out.println("Enter serviceYears:");
        try {
            serviceYears = Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException n) {
            return false;
        }

        if ((maritalStatus.equalsIgnoreCase("married") || maritalStatus.equalsIgnoreCase("unmarried")) &&
                (jobType.equalsIgnoreCase("permanent") || jobType.equalsIgnoreCase("temporary")) )
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public void checkLoanEligibility()

    {
        if (jobType.equalsIgnoreCase("permanent"))
        {
            if (maritalStatus.equalsIgnoreCase("unmarried"))
            {
                if (serviceYears >= 30)
                {
                    loanAmount = 500000;
                    isEligibleforloan = true;
                } else {
                    loanAmount = 250000;
                    isEligibleforloan = true;

                }
            }
            else if (maritalStatus.equalsIgnoreCase("married"))
            {
                if (serviceYears >= 30)
                {
                    loanAmount = 600000;
                    isEligibleforloan = true;
                }
                else
                {
                    loanAmount = 350000;
                    isEligibleforloan = true;

                }
            }

        }
        else if (jobType.equalsIgnoreCase("temporary"))
        {
            loanAmount = 100000;
            isEligibleforloan = true;
        }

    }



    public static void main(String[] args)
    {
        Loan l1 = new Loan();
        boolean inputCheck;
        /*check for valid input */
        if (inputCheck=l1.getDetails())
        {
            l1.checkLoanEligibility();
            if (l1.isEligibleforloan)
            {
                System.out.println("Loan eligibility amount:" + l1.loanAmount);
            }
            else
            {
                System.out.println("Not eligible for loan");
            }
        }
        else
        {
            System.out.println("Not Eligible for loan");
            System.out.println("valid input for Marital status:" + "married or unmarried");
            System.out.println("valid input for Jobtype:" + "temporary or permanent");
            System.out.println("valid input for Years of service: " + "greater or equal to 0");

        }
    }
}
