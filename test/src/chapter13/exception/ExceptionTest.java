package chapter13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//return;
		}finally {
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
		
		//----------------------------------------------------------
		//try with resource (AutoCloseable)
		try(FileInputStream fis2 =new FileInputStream("a.txt")){
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
