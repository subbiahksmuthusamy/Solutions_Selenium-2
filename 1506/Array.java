package com.test;

import java.util.Scanner;

public class Array {
	
	public void findprime(int arr3[])
	{
		int x;
		int y;
		int z=0;
		int count1=0;
		
		for (x=2; x<arr3.length; x++)
		{
			y=arr3[x]%2;
			
			if (y==0)
			{
				
				count1++;
			}
			
			else
			{
				z++;
			}
			
		}
		
		if (z==0)
		{
			System.out.println("There is no prime numbers in the array");
		}
		
		else
		{
			System.out.println("The number of prime numbers in the array :" +z);
		}
		
	}
	
	
	public void findelement(int arr1[], int j)
	
	{
		int k;
		int count=0;
		for (k=0;k<arr1.length;k++)
		{
			if (arr1[k] == j)
			{
				System.out.println("Element found in the Array");
				count++;
			}
			
		}
		if (count == 0)
			{
				System.out.println("Element not found in the Array");
			}
		
	}
	
	public void divisible(int arr2[])
	{
		int count = 0;
		int l;
		int a;
		int b;
		int c;
		int d;
		for (l=1; l<arr2.length; l++)
		{
			a= l%2;
			b= arr2[l];
			c= b%3;
			d= b%2;
			
			if (a==0 && c==0 && d!=0)
			{
				count++;
			}
		}
		
		System.out.println("count of oddnumbers divisible by 3 in even position:"+count);
	}

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		
		int elem;
		Scanner mscan = new Scanner(System.in);
		System.out.println("Enter the number to search in the Array:");
		elem = mscan.nextInt();
		
		Array obj1 = new Array();
		obj1.findelement(arr,elem);
		
		Array obj2 = new Array();
		obj2.divisible(arr);
		
		Array obj3 = new Array();
		obj3.findprime(arr);
		
	}

}
