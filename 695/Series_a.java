package CoreJavaConcepts;

public class Series_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int next_term=1;
		 int difference=4;
	
		  for (int n=1;n<=25;n++) {
			  // System.out.print("n: "+n);
			 // System.out.print("difference: "+difference);
			   next_term=next_term+((n-1)*difference);
			 System.out.print(next_term + ", ");
			 difference=(difference * (-1));
		 }
		  System.out.println("....Continued");

	}
	
	

}
