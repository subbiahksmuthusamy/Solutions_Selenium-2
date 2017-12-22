package com.test;

public class Series {

	public static void main(String[] args) {
		int i;
		for (i=1; i<=10; i++)
		{
			System.out.println("1/"+i);
		}
		
		int j;
		boolean k= false;
		int l;
		
		for (j=1; j<=10; j++)
		{
			l=j%2;
			
			if (l!=0 && k==false)
			{
				System.out.println(j);
				k=true;
			}
			else
			{
				if(l!=0)
				{
					System.out.println(-j);
					k=false;
				}
			}
				
			
		}

	}

}
