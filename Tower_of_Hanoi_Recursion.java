import java.util.Scanner;

public class Tower_of_Hanoi_Recursion {
   public static void tower_of_hanoi(int n,String src,String helper,String dest)
   {
      if(n==1)
      {
        System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
        return ;
      }
      
      tower_of_hanoi(n-1, src, dest, helper);
      System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
      tower_of_hanoi(n-1, helper, src, dest);
   }
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        tower_of_hanoi(n, "s" ,"h","D");
    }
}
