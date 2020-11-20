package chapter10.string;

public class StringTest {
	
	public static void main(String[] args) {
		
		// 힙 영역
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		//상수 풀
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		System.out.println(str3.concat(str4));
		
		System.out.println("Test 코드");  
	}
}
