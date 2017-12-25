package test.com;
        //(a) Count the number of odd numbers divisible by 3 in even positions.
        //(b) Search for a key value in array and print it is available in the array or not.
        //(c) Count the number of prime numbers.


public class ArrayOperations {
    private int numbers[];
    private  boolean isprimeNumber;


    public void genPrimeNumber()
    {
    int count = 0;
        System.out.println("*******Prime Numbers series and count:******");
     for (int i =0 ;i<numbers.length ;i++)
     {

         isprimeNumber = true;
         for(int j=2;j < numbers[i]; j++)
         {

             if (numbers[i]%j == 0 )
             {

              isprimeNumber =false;
                 break;

             }

         }
        if (isprimeNumber)
         {
            System.out.print(numbers[i] + ",");
             count =count + 1;

         }

     }
        System.out.println("\n" + "*******Prime number count in array:" + count);
    }

    public void searchKeyValue(int number)
    {
        boolean isKeyValueFound =false;

         for (int i : numbers)
        {
            if (i == number)
            {

                isKeyValueFound =true;
                break;
            }


        }
        if (isKeyValueFound)
        {
            System.out.println("Key value found");
        }
        else
        {
            System.out.println("key value not found");
        }

    }

    public void countOddatEvenposby3()
    {
        System.out.println("*******odd finding series*******");
        System.out.println("*******existing array and pos  below:********");
        for (int i =1;i<numbers.length;i++)
        {
            System.out.print( "["+ i + "]" + numbers[i] + ",");

        }
        System.out.println("\n" + "*******odd numbers at even positions of array that is divisible by 3*******");
        for (int i =1;i<numbers.length;i++)
        {

            if ((i%2 == 0  && numbers[i]%2 !=0 && numbers[i]%3 ==0))
            {
             System.out.print("[" + i + "]" + numbers[i]);
            }
        }
    }

   public void loadArr()
   {
       for (int i = 99;i >= 0;i--)
       {
           numbers[i] =i +  1;
       }

   }

    public static void main(String args[])
    {
        ArrayOperations aO = new ArrayOperations();
        aO.numbers = new int[100];
        aO.loadArr();
        aO.genPrimeNumber();
        aO.searchKeyValue(500);
        aO.countOddatEvenposby3();

    }




}
