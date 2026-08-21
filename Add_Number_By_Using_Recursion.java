import java.util.Scanner;

public class Add_Number_By_Using_Recursion {

    public static void addnum(int i,int x,int sum)
    {
        if(i==x)
        {
            sum += i;
            System.out.println(sum);
            return;
        }
        //System.out.println(i);
        sum += i;
        addnum(i+1, x, sum);
    }
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();

         addnum(1,n,0);
    }
}
