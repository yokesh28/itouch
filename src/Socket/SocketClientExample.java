package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClientExample {

	public static void main(String[] args) throws Exception
	{  
		
		String ip = "localhost";
		int port = 9998;      //0-1023 to 65535
		Socket ss = new Socket(ip,port);
		
		String str = "Visto";
		OutputStreamWriter os = new OutputStreamWriter(ss.getOutputStream()); 
		PrintWriter out = new PrintWriter(os);
		 out.println(str);
         out.flush();
         
	} 
	}

