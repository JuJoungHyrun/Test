package chapter14.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			int i; 
			while((i= fis.read()) != -1) {
			System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}

}