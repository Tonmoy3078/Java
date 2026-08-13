public class Zero_One_Triangle {
    public static void main(String args[])
    {
        int n = 7;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
