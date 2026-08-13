public class String_Reverse {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Tonmoy");
        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++)
        {
            int f=i;
            int b = sb.length()-1-i;

            char frontChar = sb.charAt(f);
            char backChar = sb.charAt(b);

            sb.setCharAt(f, backChar);
            sb.setCharAt(b, frontChar);
        }
        System.out.println(sb);
    }
}
