import java.util.*;
class MostOccuringElement
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 4, 5, 5, 6};
        Arrays.sort(arr);
        int max=0;
        int element=110;

        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;
            while(i < arr.length - 1 && arr[i] == arr[i + 1])
            {
                count++;
                i++;
            }
            if(count>max)         //return smallest element having maximum count.
            {
            	max=count;
            	element=arr[i];
            }

            //  if(count>=max)      //if 2 elements have same count then return largest element 
            // {
            // 	max=count;
            // 	element=arr[i];
            // }


           
        }

         System.out.println("No. of " + element + "=" + max);


    }
}