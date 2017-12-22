package testjava;

import java.util.Scanner;

public class Arrayoperation {

	public static void main(String[] args) {
		
		//count no of prime no.
		int temp=0;
		int cnt= 0;
		int Pcnt = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any limit to get a prime no:");
		int num=scan.nextInt();
	    //scan.close();
	    
		for(int i=1;i<=num;i++)
		{
			cnt = 0;
		   for(int j=i;j>=1;j--)
		   {
		   temp=i%j;
		   if(temp==0)
		   {
			   cnt+=1;
			   //System.out.print(j);
		   }
		   }
		   if(cnt==2)
		   {
			   System.out.println(i);
			   Pcnt = Pcnt + 1;             //Prime count
		   }
		}
		System.out.print("for the given no: " +num);
		System.out.println(" cnt of prime nos are: " +Pcnt);
		
		// Program to get count the number of odd numbers divisible by 3 in even positions
		
		int[] arr= new int[20];
		for(int k=0;k<num;k++)
		{
			arr[k] = k+1;
			System.out.print(arr[k]);
			System.out.print(',');
		
		}
		System.out.print(" Printing as requested:   ");
		for(int k=1; k<=num; k+=2)
		{
			if(arr[k]%3==0)
			{
				
				System.out.print(arr[k]);
				System.out.print(',');
			}
		}
		
		//Program to get key value in array //
		int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
          for(i = 0; i < n; i++)
          {
            a[i] = s.nextInt();
          }
        System.out.print("Enter the element you want to find:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }

	}

}
