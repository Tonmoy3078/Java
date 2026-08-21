import java.util.*;

public class Recursion_lec_17 {

    public static void printNUm(int x,int t)
    {
        if(x>t)
        {
            return;
        }
        System.out.println(x);
        printNUm(x+1,t);

    }
    public static void main(String args[])
    {
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t = sc.nextInt();


           printNUm(n,t);
    }
}
