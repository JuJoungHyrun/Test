package chapter10.claseex;

import java.lang.reflect.Constructor;

public class ClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		
		Person person = new Person("James");
		System.out.println(person);
		
		Class c1 = Class.forName("chapter10.claseex.Person");
		//객체를 불러옴 default 생성자로 불러옴
		Person person1 = (Person)c1.newInstance();
		System.out.println(person1 );
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
	}
}