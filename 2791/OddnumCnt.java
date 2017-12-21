package Testerinv;

import java.util.Scanner;


public class OddnumCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please Enter range of odd numbers divisible by 3 in even positions to display: ");
		int var=scan.nextInt();
		scan.close();
		
		int i,evencount=2,count=0,count1=0;
		for(i=1;i<=var;i=i+2) {
			if(i%3==0)
			{
				count++;
				if(count%evencount==0)
				{
					count1++;
				}
			}
		}
			System.out.println("Count of odd nuumbers divisible by 3 in even position for range "+ var + ":" + count1);
	}

}
