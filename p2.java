import java.io.*;
import java.net.*;

public class p2

{
	public static void main(String args[])
	{
		try
		{
			System.out.println("P2 Running...");
			ServerSocket ss = new ServerSocket(4405);
			Socket con = ss.accept();
			
			DataInputStream input = new DataInputStream(con.getInputStream());
			String msg = input.readUTF();

			System.out.println("Message Received: " + msg);
			
			Socket fs = new Socket("127.0.0.1",5506);
			DataOutputStream out = new DataOutputStream(fs.getOutputStream());
			
			if(msg.length() < 100)
			{
				out.writeUTF(msg);	
				System.out.println("Message Forwarded to P3..");		
			}
			else
			{
				System.out.println("Message not sent!");
				System.out.println("Message length exceeds the set value. \nMessage length:\t " + msg.length());
			}		
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong: " + e);
		}
	}
	
}