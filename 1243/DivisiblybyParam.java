
/*

Program 3a
Employee id: 1243

This program searches an integer array for already stored values and print the location (Key) 

it is stored. DivisiblybyParam is instantiated in main method to pass the value 3.

*/




public class DivisiblybyParam{
    
   int[] intArray = new int[]{ 1,2,3,3,3,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,23,24,25,26,28,29}; 
   
   int oddNumDivideBy;
   
   public void print_the_count(int Odby){
       
       
       this.oddNumDivideBy = Odby;
       
       int i;
       int counter=0;
      
       for (i=0;i< intArray.length;i++)
       {
           
        if((intArray[i]%2!=0) & (i%2==0))
        {
              if (intArray[i]%Odby==0)
              
              {
                //System.out.println(intArray[i]);
                counter=counter+1;
                
              }
              
              
        }  
        }
        System.out.println("Number of odd numbers divisible by 3 in even positions are = "+counter);
    }
   

    public static void main(String[] args) {
        
        DivisiblybyParam objSearch = new DivisiblybyParam();
        
       objSearch.print_the_count(3);
        
       
    }
}
 
    
