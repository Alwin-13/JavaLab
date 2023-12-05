import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
public class FileDemo 
{
	public static void main(String args[])
	{
		char [] data=new char[50];
	    FileWriter writer=null;
	    FileReader reader=null;
	    try
	    {
	    	reader=new  FileReader("input.txt");
	    	int size=reader.read(data);	        
	    	System.out.println(data);
	    	System.out.println("Size of data: "+size);
	        reader.close();
	        
	        writer=new FileWriter("output.txt");
	        writer.write(data,0,size);
	        writer.flush();
	        writer.close();
	    }
	    catch(FileNotFoundException e1)
	    {
	    	e1.printStackTrace();
	    }
	    catch(IOException e)
	    {
	    	System.out.println("Error");
	       	e.printStackTrace();	
	    } 
	}
}
