package testjava;
import java.util.Scanner;
public class Arithmeticlogic {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any limit:");
		int m=scan.nextInt();
	    scan.close();
	    
		for(i=1; i<m; i+=4)
		{
			System.out.print(i);
			System.out.print(',');
			System.out.print(j=j-4);
			System.out.print(',');
		}
		System.out.println(" ");
		int n = 1;
		for(n=1;n<=m;n++)
		{
			System.out.print(1);
			System.out.print('/');
			System.out.print(n);
			System.out.print(',');
		}
	}
}
