import java.io.*;
class BasicFileMethods
{
	public static void main(String...s) throws Exception
	{
		File f1=new File("D:\\java_programs\\IO\\Serialization\\transient and static fields\\EmpDatabase.txt");
       File f2 =new File("D:\\java_programs\\IO\\Serialization\\SerialVersionUid");
       System.out.println(f1.isFile());
     System.out.println(f2.isFile());
     System.out.println(f2.isDirectory());
     System.out.println(f1.isDirectory());
     System.out.println(f1.exists());
     System.out.println(f2.exists());
     System.out.println(f1.isAbsolute());
     System.out.println(f2.isAbsolute());
     System.out.println(f1.getAbsolutePath());
     System.out.println(f2.getAbsolutePath());
     System.out.println(f1.getName());
     System.out.println(f2.getName());
     System.out.println(f1.getParent());
     System.out.println(f2.getParent());
     System.out.println(f1.getPath());
     System.out.println(f2.getPath());
     System.out.println(f1.isHidden());
     System.out.println(f2.isHidden());
     System.out.println(f1.lastModified());
     System.out.println(f2.lastModified());
     System.out.println(f1.length());
     
     
     
     String[] list=f2.list();
     for(int i=0;i<list.length;i++)
     System.out.println(list[i]);
    File[] file=f2.listFiles();
    for(int i=0;i<file.length;i++)
     System.out.println(file[i]);
     File[] file2=f1.listFiles();
    if(file2==null)
    {
    	System.out.println("f1 is a file, hence f1.listFiles() method returns null");
    }
     

       
       
       
       
       
       
       
         
	}
}