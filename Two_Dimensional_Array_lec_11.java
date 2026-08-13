import java.util.*;

public class Two_Dimensional_Array_lec_11 {
    public static void main(String args[])
    {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();

          int[][] tk = new int[n][m];

          for(int i=0; i<n; i++)
          {
            for(int j=0; j<m; j++)
            {
               tk[i][j] = sc.nextInt();
            }
          }

          int sum=0;
          for(int i=0; i<n; i++)
          {
            for(int j=0; j<n; j++)
            {
              System.out.print(tk[i][j]+" ");
            }
            System.out.println();
          }
          
}
}
