package chapter14.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			// 데이터를 그대로 넣고 가저 오는 보조 스트림
			
			dos.writeByte(100);
			dos.write(100);
			dos.writeChar('A');
			dos.writeUTF("안녕하세뇨");
			
			//넣은값에 대한 자료형에 맞추어서 가저와야 한다.
			System.out.println(dis.readByte());
			System.out.println(dis.read());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
