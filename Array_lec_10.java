public class Array_lec_10 {
    public static void main(String args[])
    {
        // int[] mark = new int[4];
        //int mark[] = new int[4];// this line is as same as line 4;
        // mark[0] = 10;
        // mark[1] = 20;
        // mark[2] = 30;
        // mark[3] = 40;
        //instead of initialized one by one we can just simplify this like
        int mark[] = {10,20,30,40};

        //System.out.println(mark);
        //System.out.println(mark[2]);

        for(int i=0; i<4; i++)
        {
            System.out.println(mark[i]);
        }

        //Identify the length of an Array
        int tk = mark.length;
        System.out.println(tk);
    }
}
