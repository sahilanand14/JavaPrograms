import java.io.*;
class MyFile
{ public static void main(String...s) throws Exception
	{// joining outputstream to source file to write data in it.
	FileOutputStream fout=new FileOutputStream("fromtransfer.txt");
	
	//Data to be written in source file.
	String str="india is agood country";
	//converting it into byte array.
	byte b[]=str.getBytes();
	//the below statement write contents of byte array b into file connected to fout stream.
	fout.write(b);

	//connecting input stream to source file to read data.
	FileInputStream fin=new FileInputStream("fromtransfer.txt");
     byte[] b1=new byte[fin.available()];  //here b1 is only declared.
     // after the below  statement b1.length bytes from file connected to fin will be read in to b1 array;
     fin.read(b1);   //now b1 contains data in byte form

   // connecting outputstream to file in which data is to be copied.
	FileOutputStream fout1=new FileOutputStream("totransfer.txt");
	//the below statements writes the byte array b1 to file connected to fout1 stream.
	fout1.write(b1);

    //connecting output stream to write data in this file also.
	FileOutputStream fout2=new FileOutputStream("totransfer2.txt");
	//the below statements writes the byte array b1 to file connected to fout2 stream.
	fout2.write(b1);
	//connecting output stream to write data in this file also.	
FileOutputStream fout4=new FileOutputStream("totransfer2.txt");
	
	//the below statements writes the byte array b1 to file connected to fout24 stream.
	fout4.write(b1);

    }
}