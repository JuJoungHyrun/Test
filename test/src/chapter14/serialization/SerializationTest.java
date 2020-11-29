package chapter14.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//직렬화 가능 여부를 선언해야 인스턴스 내용을 사용할수 있다.
// Externalizable <- 직접 자료를 읽고 쓰는 방법을 지정하는것
class Person implements Serializable{
	String name;
	transient String job;
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {

	
	public static void main(String[] args) {
		
		Person personLee = new Person("이순신", "엔지니어");
		Person personKim = new Person("김유신", "선생님");
		
		//클래스에 대한 정보가 같이 들어가게 된다 <- 바로 일반 텍스트로 사용 X
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);){
	
			Person inPersonLee = (Person) ois.readObject();
			Person inPersonKim = (Person) ois.readObject();
			
			System.out.println(inPersonLee);
			System.out.println(inPersonKim);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
