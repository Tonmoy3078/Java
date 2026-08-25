public class Recursion_Print_a_string_reverse {
    
    
    public static void printReverse(String s,int index)
    {
        if(index==0)
        {
            System.out.print(s.charAt(index));
            return;
        }
        System.out.println(s.charAt(index));
        printReverse(s, index-1);

    }
    public static void main(String args[])
    {
          String str ="TONMOY";
          printReverse(str, str.length()-1);
    }
}
