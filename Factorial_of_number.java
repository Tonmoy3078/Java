import java.util.*;

public class Factorial_of_number {
    
    public static void factorial(int n)
    {
        int ans = 1;
        if(n<0)
       {
          System.out.println("Invalid");
          return;
       }
       
       
       for(int i=1; i<=n; i++)
       {
         ans =ans * i;
       }

       System.out.println(ans);
       return;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //System.out.println("The factoriral of the number is "+factorial(n));
        factorial(n);

    }
}
