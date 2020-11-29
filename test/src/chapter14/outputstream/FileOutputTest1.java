package chapter14.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		
		//append false
		try ( FileOutputStream fos = new FileOutputStream("output.txt", true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
