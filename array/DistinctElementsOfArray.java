class DistinctElementsOfArray
{
	public static void main(String[] args) {
		int arr[]={6, 10, 5, 4, 9, 120, 4, 6, 10};
		for(int i=0;i<arr.length;i++)
		{   int j;
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
					break;
			}
			if(i==j)
			System.out.println(arr[i]);
		}
	}
}