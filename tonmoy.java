import java.util.*;

public class tonmoy
{
 
  public static void main(String args[])
    {
       StringBuilder sb = new StringBuilder("tonmoy");

       char sp =  sb.charAt(0);
       System.out.println( sp);

       sb.insert(0, "tk");
       System.out.println(sb);

       sb.reverse();
       System.out.println(sb);

       sb.delete(0, 3);
       System.out.println(sb);

       sb.append("das");
       System.out.println(sb);
      
       System.out.println(sb.length());



    }
  }

