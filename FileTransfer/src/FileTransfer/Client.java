package FileTransfer;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws Exception {
		
		//socket connection between client and server
		byte b[] = new byte[20002];
		Socket sr = new Socket("localhost", 4333);
		InputStream is = sr.getInputStream();
		FileOutputStream fr = new FileOutputStream("C:\\Users\\Harsh\\OneDrive\\Desktop\\sample_text.txt");
		is.read(b, 0, b.length);
		fr.write(b, 0, b.length);
	}

}
