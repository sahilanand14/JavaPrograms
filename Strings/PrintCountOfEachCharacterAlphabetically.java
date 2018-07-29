class PrintCountOfEachCharacterAlphabetically
{
	public static void main(String []s)
	{
		String str="sahil anand is the best";
		int count[]=new int[123];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		for(int i=65;i<count.length;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)i+"\t"+count[i]);
			}
		}
	}
}