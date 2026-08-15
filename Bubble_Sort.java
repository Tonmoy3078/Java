public class Bubble_Sort {
    public static void main(String args[])
    {

        int arr[] = {7,8,5,6,3,4};

        //bubble sort
        //time complexity = O(n^2);
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
