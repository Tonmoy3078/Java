import java.util.*;

public class HW_Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s = sc.next();

        switch (s)
        {
            case "+":
            System.out.println(a+b);
            break;

            case "-":
            System.out.println(a-b);
            break;

            case "*":
            System.out.println(a*b);
            break;

            case "/":
            System.out.println(a/b);
            break;

            default:
                System.out.println("invalid");
        }
    }
}
