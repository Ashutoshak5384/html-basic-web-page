import java.io.*;
import java.net.*;

class Client

{
	public static void main(String[] args)throws Exception{
		Socket s = new Socket("localhost" ,777);
		InputStream obj = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		String str;
		while((str = br.readLine()) != null)
			System.out.println("From server "+str);
		br.close();
		s.close();

		
	}
}
