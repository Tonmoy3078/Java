import java.util.*;

public class Conditional_Statements_lec_03
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // if(age>18)
        // {
        //     System.out.println("adult");
        // }
        // else
        // {
        //     System.out.println("not adult");
        // }

        if(age%2==0)
        {
            System.out.println("even");

        }
        else
        {
            System.out.println("odd");
        }
 
    }
}
