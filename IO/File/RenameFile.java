import java.io.*;
class RenameFile
{
	public static void main(String...s)
	{
		new File("OldFile.txt").renameTo(new File("newFile.txt"));

	}
}