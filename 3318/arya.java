package Assg3;

public class arya {

	public static void main(String[] args) {
		
		int []ary={1,3,4,5,6,9,12,13,15,16,18,21,24,27,30};
		int f=0,c=0,j=0;
		for(int i=0;i<=14;i++)
		  {
			 j=ary[i];
			if(f==1)
				{
					if(j%3==0)
						if(j%2!=0)
							c=c+1;
					f=0;
				}
			else
				f=1;
		  }
		System.out.println("Count of odd numbers divisible by 3:," +c);
	}

}
