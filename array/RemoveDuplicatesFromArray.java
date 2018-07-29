import java.util.*;
class RemoveDuplicatesFromArray
{
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 2, 5, 6, 7, 1, 3, 8, 9, 5};
        int length = arr.length;
        int newLength = removeDuplicates(arr, length);
        for(int i = 0; i < newLength; i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static int removeDuplicates(int array[], int length)
    {
        if(length == 0 || length == 1)
            return length;
        int temp[] = new int[length];
        int j = 0;
        Arrays.sort(array);
        for(int i = 0; i < length - 1; i++)
            if(array[i] != array[i + 1])
                temp[j++] = array[i];
        temp[j++] = array[length - 1];
        for (int i = 0; i < j; i++)
            array[i] = temp[i];

        return j ;

    }
}