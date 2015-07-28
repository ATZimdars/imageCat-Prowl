import java.io.*;

public class imagecatProwl 
{
	public static void main(String[] args) 
			throws IOException
	{
//Json File Location
		
		final File jsonIn = new File("/");
		
//Index File Location
		
		final File indexIn = new File("/");
		
		if (imagecatMove.checkJson(jsonIn)==true && imagecatMove.checkIndex(indexIn)==true)
		{
			imagecatMove.copyFile(jsonIn, indexIn);
		}
		else
		{
			System.out.println("File locations are incorrect or do not exsist.");
			if (imagecatMove.checkJson(jsonIn)==false)
			{
				System.out.println("Json file location specified is not a file, check file and try again.");
			}
			if (imagecatMove.checkIndex(indexIn)==false)
			{
				System.out.println("Index file location specified is not a file, check file and try again.");
			}
		}
}
}
