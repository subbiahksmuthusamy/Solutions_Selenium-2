package Assg2;

public class Series1 {
	
	public static void main(String[] args) {
		int i=1, l=1;
		for(i=1;i<=20;i++)
			{
				if(i%2!=0)
					if(l==1)
						{				
						System.out.print(i+",");
						l=0;
						}
					else
						{
						System.out.print(-i+",");
						l=1;
						}
			}
		
		}
	

}
