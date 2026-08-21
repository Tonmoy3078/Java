import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int v[] = new int[n];

        for(int i=0; i<n; i++)
        {
            v[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
               if(v[j]>v[j+1])
               {
                 int t = v[j];
                v[j] = v[j+1];
                v[j+1] = t;
               }
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(v[i]+" ");
        }
    }
}
