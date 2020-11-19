package chapter10.claseex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//1
		Class c1 = String.class;
		
		//2
		String str = new String();
		Class c2 = str.getClass();
		
		//3
		Class c3 = Class.forName("java.lang.String");
		
		//로컬에 없을때나 자료형에 대해서 정확하게 알지 못할때 사용
		Constructor[] cons = c3.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}
