package chapter14.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt"); 
		//FileReader fis = new FileReader("reader.txt"); <-- 바로 reader로 불러 오더간
		//소켓에서 사용하는 경우에는 보조 스트림에 넣어서 사용하며 된다.
		InputStreamReader isr = new InputStreamReader(fis);
		
		int i;
		while( (i = isr.read()) != -1) {
			System.out.print((char)i);
		}
		
		isr.close();
		
	}

}
