class SelectionSort
{
	public static void main(String[] args) {
		int arr[]={23,56,4,3,4};


		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[index]>arr[j])
					index=j;
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}

		for(int a:arr)
		{
			System.out.println(a);
		}




	}
}