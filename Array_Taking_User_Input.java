import java.util.Scanner;

public class Array_Taking_User_Input {
    public static void main(String args[])   
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mark[] = new int[n];

        //Taking input
        for(int i=0; i<n; i++)
        {
            mark[i] = sc.nextInt();
        }

        //Taking output
        for(int i=0; i<n; i++)
        {
            System.out.println(mark[i]);
        }
    }
}
