import java.util.Scanner;


public class PrimeNumLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String primedisp="";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please provide the range to display Prime Numbers:");
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++)
		{
			int cnt=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
					cnt++;
			}
			if (cnt==2)
				primedisp=primedisp+i+" ";
		}
		System.out.println("Prime numbers from 1 to " + n +" are:");
		System.out.println(primedisp);
		
	}

}
