import java.io.*;
import java.util.*;
import java.util.zip.*;

class Unzip
{
	public static void main(String...s) throws Exception
	{

		ZipFile zipfile=new ZipFile("test1.zip");
		Enumeration enu=zipfile.entries();
		while(enu.hasMoreElements())
		{
			ZipEntry zipentry=(ZipEntry)enu.nextElement();
			String name=zipentry.getName();
			System.out.println("Name:\t"+name);
			InputStream is=zipfile.getInputStream(zipentry);
			FileOutputStream fout=new  FileOutputStream(name);
			int length;
			while((length=is.read())!=-1)
				fout.write(length);
			
			is.close();
			fout.close();
			
		}
		zipfile.close();
	}
}