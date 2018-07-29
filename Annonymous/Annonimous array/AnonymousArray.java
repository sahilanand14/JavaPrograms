class AnonymousArray
{
	public static void main(String...s)
	{
        sum(new int[]{1,2,4,5,6,7,8});
	}
	public static void sum(int []a)
	{
		for(int i:a)
			System.out.println(i);
	}
}