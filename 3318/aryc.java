package Assg3;

public class aryc {

	public static void main(String[] args) {
		
		int []ary={1,3,4,5,6,7,12,13,15,16,18,21,24,29,30};
		int c=0,pc=0;
		for(int i=0;i<=14;i++)
		  {
			int j=ary[i];
			if(j!=1)
			  {
				c=0;
				for(int k=1;k<=j;k++)
				   {
					if(j%k==0)
				 		c=c+1;
				   }	
			   }
			if(c==2)
			{
			   System.out.print(j+",");
			    pc=pc+1;	
			}
		  }
		System.out.println("\n"+pc+" Prime numbers found!");
	}
}
