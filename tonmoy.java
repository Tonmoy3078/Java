import java.text.DecimalFormat;
import java.util.*;

public class tonmoy {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=1,b=1,c=1;
        for(int i=1; i<=n; i++)
        {
          System.out.println(a+" "+b+" "+c); 
          b=a+a;
          c=a*b;
          System.out.println(a+" "+b+" "+a*b);
          a++;
        }
    }
}
