
public class Arraylogic {

	
	public static void main(String[] args) {
		
		int count=0;
		
		int arrobj[]={10,25,27,35,42};
				
		for(int i=0;i<=4;i++){
			if(arrobj[i]==2)
			{
				System.out.println("value you are looking for is present in the Arraystring");
				count++;
			}
		}
		if(count==0)
			System.out.println("value you are looking for is not present in arrayString");
	}
}
