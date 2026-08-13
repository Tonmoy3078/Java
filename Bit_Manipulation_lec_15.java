import java.util.Scanner;

public class Bit_Manipulation_lec_15 {
    public static void main(String args[])
    {
        //operation-1:
        //Get bit : return if position bit is zero or one;
        //Bit Mask : 1<<pos 
        //Operation : AND;
        /*
        int n=5;
        int pos=2;
        int pos=3;
        int bitMarks = 1<<pos;
        if((bitMarks & n)==0)
        {
            System.out.print("Bit was zero");
        }
        else
        {
            System.out.print("Bit was one");
        }
        */


       //Operation-2:
       //Set bit : Make the position bit one(1);
       //Bit Mask : 1<<pos;
       //Operation : OR;
       /*
       int n = 5;
       int pos = 1;
       int bitMask = 1<<pos;
       int newNumber = (bitMask | n);
       System.out.println(newNumber);
       */

       //Operation-3;
       //Clear bit : Make the digit clear of certain position
       /*
       int n = 5;//0101
       int pos = 2; 
       int bitMask = 1<<pos;
       int notBitMask = ~(bitMask);
       int newNumber = (notBitMask & n);
       System.out.println(newNumber);
       */
       

       //Operation-4;
       //Update bit : Make update the position bit
       //Two operation needed for this operation;
       //1.For make 1(Set Operation) and 2.For make 0(Clear Operation)
       Scanner sc = new Scanner(System.in);
       int oper = sc.nextInt();

       int n = 5;//0101
       int pos = 1; 
       //int oper = 1//update bit to 1 else update bit 0;
       int bitMask = 1<<pos;
       if(oper==1)
       {
         //set
        
         int newNumber = bitMask | n;
         System.out.println(newNumber);
        
       }
       else
       {
        //clear
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
       }



      


    }
}
