package chapter14.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		
		System.out.println("입력 : ");
		
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			// 1byte씩 읽기때문에 같아질수가 없다
			while((i = isr.read()) != '끝') {
			System.out.print((char)i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
