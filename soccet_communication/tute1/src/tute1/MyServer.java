package tute1;

import java.net.*;  
import java.io.*;  

public class MyServer {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("Hello World= "+str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  
