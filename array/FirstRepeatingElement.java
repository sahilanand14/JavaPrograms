class FirstRepeatingElement
{
    public static void main(String[] args)
    {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        for(int i = 0; i < arr.length; i++)
        {
            int flag = 0;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}