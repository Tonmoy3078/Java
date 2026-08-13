
import java.util.*;

public class User_Input {
   public static void main(String[] args)
   {
     System.out.println("Enter your name");
     Scanner sc = new Scanner(System.in);
     String name = sc.next();//It's take only one word like char in c++
     String name = sc.nextLine();//It's take the whole line like getline string in c++
     //nextINT()- take integer type input;
     //nextFloat() - take floatin type input;
     
     System.out.println(name);
   }
}
