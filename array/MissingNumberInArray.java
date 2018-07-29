// Find missing number in an array of integers from 1 to 20
class MissingNumberInArray
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20};
        //first way
        int sum, sum2 = 0, missing = 0;
        sum = (arr[arr.length - 1] * (arr[arr.length - 1] + 1)) / 2; //sum of n terms n*(n+1)/2   here n=20

        for(int i = 0; i < arr.length; i++)
            sum2 = sum2 + arr[i];

        missing = sum - sum2;
        System.out.println(missing);

        //second way

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i + 1] != arr[i] + 1)
            {
                System.out.println(arr[i] + 1);
                break;
            }
        }


    }
}