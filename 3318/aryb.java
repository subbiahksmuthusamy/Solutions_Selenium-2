package Assg3;

public class aryb {

	public static void main(String[] args) {
		
		int []ary={1,3,4,5,6,9,12,13,15,16,18,21,24,27,30};
		int k=1,j=0, f=0;
		for(int i=0;i<=14;i++)
		  {
			 j=ary[i];
			if(j==k)
			{	
				f=1;
				i=15;
			}
			else
				f=0;
		  }
		if(f==1)
			System.out.println("key found...:) ");
		else
			System.out.println("key not found...:( ");
		}

}
