package tute1;

import java.net.*;  
import java.io.*;  

public class MyClient {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("this is message passed from server");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  