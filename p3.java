import java.io.*;
import java.net.*;

public class p3
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("P3 Running...");
			ServerSocket ss = new ServerSocket(5506);
			Socket con = ss.accept();
			
			DataInputStream input = new DataInputStream(con.getInputStream());
			String msg = input.readUTF();
			System.out.println("Message successfully received: "+msg);
			System.out.println("Message length is: "+msg.length());
			
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong..." );
		}
	}
}
