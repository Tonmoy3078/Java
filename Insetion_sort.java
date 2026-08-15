public class Insetion_sort {
    public static void main(String args[])
    {
        int arr[] = {7,8,5,6,3,4};

        //selection sort
        for(int i=1; i<arr.length; i++)
        {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
               arr[j+1] = arr[j];
               j--; 
            }
            //placement
            arr[j+1] = current;
        }

        for(int u : arr)
        {
            System.out.print(u+" ");
        }
    }
}
