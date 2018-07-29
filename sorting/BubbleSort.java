class BubbleSort
{
	public static void main(String[] args) {
		int arr[]={1,3,4,553,221,12,34,55,322,45,56,67};



		for (int i=0;i<arr.length-1;i++) //this is the number of passes.
		{
			boolean flag=false;

			for(int j=0;j<arr.length-1-i;j++)  //comparing adjacent elements.
			{
				if(arr[j]>arr[j+1])  //swap
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=true;



					}

			}
			if(flag==false)
				break;
		}
		for(int a:arr)
		{
			System.out.println(a);
		}

	}
}