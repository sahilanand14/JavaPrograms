class araysorts
{
public static void main(String...s)
{

int arr[]={9,8,1,2,7,6,4,5,12,89,76,67,55,50};

int k=0;
for(int j=0;j<arr.length;j++)
{ int max=0;
for(int i=j;i<arr.length;i++)
    {
	if(arr[i]>max)
	{
	max=arr[i];
	k=i;
	}
     }
System.out.println(max);
int temp=arr[j];
arr[j]=arr[k];
arr[k]=temp;

}

}

}