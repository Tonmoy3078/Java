public class Selection_sort {
    public static void main(String args[])
    {
        int arr[] = {7,8,5,6,3,4};

        for(int i=0; i<arr.length-1; i++)
        {
            int small = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[small]>arr[j])
                {
                    small = j;
                }
            }
            int t = arr[small];
            arr[small] = arr[i];
            arr[i] = t;
        }

        for(int u : arr)
        {
            System.out.print(u+" ");
        }
    }

    
}
