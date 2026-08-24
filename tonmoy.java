//This file is only use for practicing the codes

import java.text.DecimalFormat;
import java.util.*;

public class tonmoy {
    public static void main(String args[]) 
    {
       Scanner sc = new Scanner(System.in);
       String S = sc.next();

       for(int i=0; i<16; i++)
       {
         for(int j=0; j<16-i; j++)
         {
            System.out.print("*");
         }
         System.out.println();
       }
    }
}

