import java.util.*;

public class Function_lec_07 {

    public static void PrintMyname(String name)
    {
        System.out.println(name);
        return;
    }
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       PrintMyname(s);
   }
}