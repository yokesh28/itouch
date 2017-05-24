package msd;

import java.io.*;
import java.net.*;

public class client {
	
	 
		 public static void main(String[] args) throws Exception
		  {
		     Socket sock = new Socket("172.16.2.177", 3000);
		                               // reading from keyboard (keyRead object)
		     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		                              // sending to client (pwrite object)
		     OutputStream ostream = sock.getOutputStream(); 
		     PrintWriter pwrite = new PrintWriter(ostream, true);
		 
		                              // receiving from server ( receiveRead  object)
		     InputStream istream = sock.getInputStream();
		     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
		 
		     System.out.println("Enter key");
		 
		     String receiveMessage, sendMessage;               
		     while(true)
		     {
		        sendMessage = keyRead.readLine();  // keyboard reading
		        
	
		        switch(sendMessage) {
			     case "A" :
			    	 sendMessage = "A";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				   
			        break; 
			     
			     case "B" :
			    	 sendMessage = "B";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				 
			        break; 
			     case "C" :
			    	 sendMessage = "C";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				    
			        break; 
			     case "D" :
			    	 sendMessage = "D";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				     
			        break; 
			     case "COPY" :
			    	 sendMessage = "COPY";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				    
			        break; 
			     case "CUT" :
			    	 sendMessage = "CUT";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
				    
			        break; 
			     case "PASTE" :
			    	 sendMessage = "PASTE";
			    	 pwrite.println(sendMessage);       // sending to server
				     pwrite.flush();                    // flush the data
			        break; 
			
			        
			  }
		        
		        
		       
		       
		        
		        
		      }               
		    }                    
}
