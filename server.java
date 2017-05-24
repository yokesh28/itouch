package msd;

import java.awt.event.KeyEvent;
import java.io.*;
import java.net.*;
import java.awt.Robot;

public class server {

	public static void main(String[] args) throws Exception
	  {
	      ServerSocket sersock = new ServerSocket(4001);
	      System.out.println("Server  ready for chatting");
	      Socket sock = sersock.accept( );                          
	                              // reading from keyboard (keyRead object)
	      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		                      // sending to client (pwrite object)
	      OutputStream ostream = sock.getOutputStream(); 
	      PrintWriter pwrite = new PrintWriter(ostream, true);
	 
	                              // receiving from server ( receiveRead  object)
	      InputStream istream = sock.getInputStream();
	      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
	 
	      String receiveMessage, sendMessage;   
	      Robot robot = new Robot();
	      
	      while(true)
	      {
	        if((receiveMessage = receiveRead.readLine()) != null)  
	        { 
	        switch(receiveMessage) {
	        case "A" :
		    	 robot.keyPress(KeyEvent.VK_A);
		    	 robot.keyRelease(KeyEvent.VK_A);
		        break; 
		     
		     case "B" :
		    	 robot.keyPress(KeyEvent.VK_B);  
		    	 robot.keyRelease(KeyEvent.VK_B);
		        break; 
		     case "C" :
		    	 robot.keyPress(KeyEvent.VK_C);
		    	 robot.keyRelease(KeyEvent.VK_C);
		        break; 
		     case "D" :
		    	 robot.keyPress(KeyEvent.VK_D); 
		    	 robot.keyRelease(KeyEvent.VK_D);
		        break; 
		     case "COPY" :
		    	 robot.keyPress(KeyEvent.VK_CONTROL);
		         robot.keyPress(KeyEvent.VK_C);
		    	 robot.delay(2);
		         robot.keyPress(KeyEvent.VK_C);
		         robot.keyPress(KeyEvent.VK_CONTROL);
		         robot.delay(2);
		        break; 
		     case "CUT" :
		    	 robot.keyPress(KeyEvent.VK_CONTROL);
		         robot.delay(2);
		         robot.keyPress(KeyEvent.VK_X);
		         robot.keyRelease(KeyEvent.VK_X);
		         robot.keyRelease(KeyEvent.VK_CONTROL);     
		        break; 
		     case "PASTE" :
		    	 robot.keyPress(KeyEvent.VK_CONTROL);
		    	 robot.delay(2);
		         robot.keyPress(KeyEvent.VK_C);
		         robot.keyRelease(KeyEvent.VK_V);
		         robot.keyRelease(KeyEvent.VK_CONTROL);     
		        break; 
	        }         
	       
	      }               
	    }                    
}
}


