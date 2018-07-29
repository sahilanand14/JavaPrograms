class FirstNonRepeatingElement
{
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5, 5,9,8};

        for(int i = 0; i < arr.length; i++)
        {
            int flag = 1;
            for(int j = 0; j < arr.length; j++)
            {
                if(j != i)
                {
                    if(arr[i] == arr[j])
                    {
                        flag = 0;
                        break;
                    }
                    
                }
            }
            if(flag == 1)
            {
                System.out.println(arr[i]);
                //break;
            }

        }
    }
}