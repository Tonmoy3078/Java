public class Daimond_pattern {
 
   public static void main(String args[])
    {
       int n = 6;
       
       //upper part
       for(int i=1; i<=n; i++)
       {
        //1st part  
        for(int j=1; j<=n-i; j++)
          {
            System.out.print(" ");
          }
          for(int j=1; j<=i; j++)
          {
            System.out.print("*");
          }
          
          //2nd part
          for(int j=2; j<=i; j++)
          {
            System.out.print("*");
          }  
          System.out.println();
        }


        for(int i=n-1; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            for(int j=n-1; j>n-i; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
