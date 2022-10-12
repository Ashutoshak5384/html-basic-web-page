import java.io.*;
import java.net.*;
class Server
{
public static void main(String args [ ])
throws Exception
{
ServerSocket ss = new ServerSocket(777);
Socket s = ss .accept( );
System.out.println("Connected");
OutputStream obj = s.getOutputStream( );
PrintStream ps = new PrintStream(obj);
String str = "Hello Client";
ps.println(str);
ps.println("Bye");
ps.close( );
ss.close( );
s.close( );
}} 
