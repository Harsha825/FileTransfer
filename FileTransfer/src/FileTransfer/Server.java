package FileTransfer;

import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) throws Exception {
		
		//accepting connection
		ServerSocket s = new ServerSocket(4333);
		Socket sr = s.accept();
		FileInputStream fr = new FileInputStream("C:\\Users\\Harsh\\OneDrive\\Desktop\\sample.txt");
		byte b[]  = new byte[20002];
		fr.read(b, 0 , b.length);
		
		OutputStream os = sr.getOutputStream();
		os.write(b, 0, b.length);
	}

}
