// DataOutputStream and DataInputStream are high level stream.
// when we connect DataInputStream to a file ,it reads data from a file.
// when we connect DataInputStream to a keyboard (using system.in) then it reads data from keyboard.

// when we connect DataOutputStream to a file, it writes data to a file.
// when we connect DataOutputStream to monitor it writes data on monitor.


import java.io.*;
class DataInputStreamExample
{
public static void main(String...s) throws IOException
{FileOutputStream fout=new FileOutputStream("dataoutputstream.txt");
DataOutputStream dout=new DataOutputStream(fout); //DataOutputStream connected to a file.
dout.writeInt(21);
dout.writeLong(21909090);
dout.writeDouble(21.90);
dout.writeBoolean(true);
//below three methods write string to file.
dout.writeChars("hello");
dout.writeUTF("India");
dout.writeBytes("country");

//NOTE: DataOutputStream writes data in encrypted manner in file.
// Therefore it wont be understandable.
// Also the order in which read() operations are performed must be same in which write() operations are performed.
FileInputStream fin=new FileInputStream("dataoutputstream.txt");
DataInputStream din=new DataInputStream(fin);//DataInputStream connected to a file.
int l=din.readInt();
long h=din.readLong();
double d=din.readDouble();
boolean b=din.readBoolean();
String str=din.readLine();//readLine method of DataInputStream is now Deprecated.
// String str=din.readUTF(); now readUTF is used instead.
System.out.println(l+" "+h+" "+d+" "+b+" "+str);
}


}