import java.util.*;

public class Strings_lec_12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //String name = sc.next();// take input only one word;
        //String name = sc.nextLine();//take input the whole line or sentence;

        // System.out.println("Your name is : "+ name);
        // int tk = name.length();
        // System.out.println(tk);

        // Concatenation of string ;
        // String name = "tonmoy";
        // String name2 = "DAs";
        // String full = name+name2;
        // System.out.println(full);

        // CahrAt
        // for(int i=0; i<full.length(); i++)
        // {
        //     System.out.print(full.charAt(i)+" ");//that's print every single char from the string
        // }
        

        // //compare string 
        // String tk2 = "tonmoy";
        // String tk3 = "tonmoy";

        // //tk2>tk3 = +value;
        // //tk2==tk3 = 0;
        // //tk2<tk3 = -value
        // if(tk2.compareTo(tk3)==0)
        // {
        //     System.out.println("Strings are equal");
        // }
        // else
        // {
        //     System.out.println("not equal");
        // }



        //SUbstrings
        String name = "TONMOY KUMAR DAS";
        String f = name.substring(0,4);
        System.out.println(f);
        
        //Strings are Immutable

        
    }
}
