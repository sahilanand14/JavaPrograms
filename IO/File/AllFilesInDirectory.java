import java.io.*;
class AllFilesInDirectory
{
	public static void main(String[] args)
	{
		File file=new File(args[0]);
		if(!file.exists())
			{
				System.out.println(args[0]+" does not exists!");
				return;
			}
			tree(args[0]);
	}
	public static void tree(String filename)
	{
		File file=new File(filename);
		if(!file.isDirectory())
		{
			System.out.println(filename);
			return;
		}
		String files[]=file.list();
		for(int i=0;i<files.length;i++)
		{
			tree(filename+"\\"+files[i]);
		}
	}
}