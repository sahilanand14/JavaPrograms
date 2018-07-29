import java.io.*;
class ListDirectotyContents
{
	public static void main(String...s)
	{
		String dirpath="D:\\";
		File dir=new File(dirpath);
		File []list=dir.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
				System.out.println(list[i].getPath()+"  (File)");
			else if(list[i].isDirectory())
				System.out.println(list[i].getPath()+"  (Directory)");
				
		}
	}

}