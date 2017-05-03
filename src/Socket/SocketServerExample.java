package Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {  
public static void main(String[] args) throws Exception
		{  
			ServerSocket soc = new ServerSocket(9998);
			System.out.println("Server is waiting for client");
			
			Socket ss = soc.accept();
			
			System.out.println("Client Connected");
			
			BufferedReader  br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			String str = br.readLine();
			System.out.println("CLient data: "  + str);
			
			
			
		}  
}