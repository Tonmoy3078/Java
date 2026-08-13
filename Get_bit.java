public class Get_bit {
    public static void main(String args[])
    {
        int n=5;
        //int pos=2;
        int pos=3;
        int bitMarks = 1<<pos;

        if((bitMarks & n)==0)
        {
            System.out.print("Bit was zero");
        }
        else
        {
            System.out.print("Bit was one");
        }
    }
}
