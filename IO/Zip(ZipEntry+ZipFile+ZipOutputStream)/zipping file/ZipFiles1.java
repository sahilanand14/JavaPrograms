import java.io.*;
import java.util.zip.*;
class ZipFiles1
{
	public static void main(String...s) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("test1.zip");
		ZipOutputStream zos=new ZipOutputStream(fout);
		String filename1="file1.txt";
		String filename2="file2.txt";
		String filename4="file4.txt";
		
		addToZipFile(filename1,zos);
		addToZipFile(filename2,zos);
		addToZipFile(filename4,zos);
		zos.close();
		fout.close();


	}

	public static  void addToZipFile(String filename,ZipOutputStream zos) throws Exception
	{
		System.out.println("Writing "+filename+" toZipFile");
		FileInputStream fin=new FileInputStream(filename);
		ZipEntry zipentry=new ZipEntry(filename);
		zos.putNextEntry(zipentry); //put entry in test1.zip.
		
		byte b[]=new byte[fin.available()];
		fin.read(b);//now b will contain data in form of bytes from a file which is connected to stream fin currently.
		zos.write(b);//data will be written to file connected to zos(i.e test1.zip).
		
		zos.closeEntry();//close entry in test1.zip.
		fin.close();

	}
}