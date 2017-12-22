
public class Series {
    public void genSeries1()
    {
        System.out.println("Series 1:");
        for (int i =1;i<50;i++)
        {
            System.out.print("1" + "/" + i + ",");
        }
    }

    public void genSeries2()
    {
        int j =1;
        boolean b = true;
        System.out.println("\nSeries 2:");
        for( int i =1; i< 50; i++)
        {
            if (b == false)
            {
                System.out.print("-" + j + ",");
                b = true;
            }
            else
            {
                System.out.print(j + ",");
                b=false;
            }
            j =j + 2 ;
        }
    }
    public static void main(String[] args)
    {
        Series s1 = new Series();
        s1.genSeries1();
        s1.genSeries2();
    }
}
