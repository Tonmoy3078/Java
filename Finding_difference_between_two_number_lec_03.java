import java.util.*;

public class Finding_difference_between_two_number_lec_03 {
    public static void main(String[] args)
    {
        Scanner tk = new Scanner(System.in);
        int a = tk.nextInt();
        int b = tk.nextInt();

        if(a==b)
        {
            System.out.println("equal");
        }
        
         else if(a>b)
            {
                System.out.println("a is greater");
            }
            else
            {
                System.out.println("a is lesser");
            }
        
        
    }
}
