public class String_Builder_lec_13 {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        //char at index 0;
        System.out.println(sb.charAt(0));

        //set char at index;
         sb.setCharAt(0,'p');
         System.out.println(sb);


         //insert char at index;
         sb.insert(2, 'n');
         System.out.println(sb);

         //delete the extra 
         sb.delete(2, 3);
         System.out.println(sb);

         //append in the string 
         sb.append("pl");
         System.out.println(sb);


         //print length
         System.out.println(sb.length());


         //reverse the string 
         sb.reverse();
         System.out.println(sb);

    }
}
