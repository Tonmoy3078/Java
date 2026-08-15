import java.text.DecimalFormat;
import java.util.*;

public class tonmoy {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] tk = new int[n];
        for(int i=0; i<n; i++)
        {
            tk[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(tk[j]>tk[j+1])
                    {
                        int t = tk[j];
                        tk[j] = tk[j+1];
                        tk[j+1] = t;
                    } 
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(tk[i]+" ");
        }
    }
}
