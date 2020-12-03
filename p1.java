import java.util.*;
import java.io.*;
import java.net.*;

public class p1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("P1 Running...");
			Scanner s = new Scanner(System.in);
			Socket cs = new Socket("localhost",4405);
			
			System.out.print("\nEnter the Message: ");
			String msg = s.nextLine();
			
			DataOutputStream out = new DataOutputStream(cs.getOutputStream());
			out.writeUTF(msg);
			
			System.out.println("Message Sent..");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong: " + e);
		}
	}
}
