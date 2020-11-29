package chapter14.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FIleCopy {

	public static void main(String[] args) throws IOException {
		
		long milliseconds = 0;
		
		//buffered 속도향상
		try( FileInputStream fis = new FileInputStream("decorator.txt");
				FileOutputStream fos = new FileOutputStream("copydecorator.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Socket socket = new Socket();
		
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine();
		
		System.out.println("시간 :" + milliseconds);
	}

}
