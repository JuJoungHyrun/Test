package chapter11.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("이순신1");
		set.add("이순신2");
		set.add("강감찬");
		set.add("강감찬");
		
		// 순서대로 나오지 않고 중복도 되지 않는다.
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
