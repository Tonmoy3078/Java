import java.util.*;

public class Floyds_Triangle_lec_05 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
