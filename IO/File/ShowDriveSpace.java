import java.io.*;
class ShowDriveSpace
{
	public static void main(String...s)
	{
		File[] roots=File.listRoots();
		long l=1024*1024*1024;
		for(int i=0;i<roots.length;i++)
		{
			System.out.println(roots[i]);
			System.out.println("Free Space:\t"+(double)roots[i].getFreeSpace()/l+" GB");
			System.out.println("Usable Space:\t"+(double)roots[i].getUsableSpace()/l+" GB");
			System.out.println("Total Space:\t"+(double)roots[i].getTotalSpace()/l+" GB");
			System.out.println("Used Space:\t"+(((double)roots[i].getTotalSpace()/l)-(double)(roots[i].getFreeSpace()/l))+" GB");
			
		}

	}
}