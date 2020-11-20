package chapter11.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList.toString());
		myList.add(1, "D");
		System.out.println(myList.toString());
		myList.removeLast();
		System.out.println(myList.toString());
		
		//set은 중간에 삽입이 안된다
		for(int i=0; i<myList.size();i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
		
		myList.set(1, "d");
		System.out.println(myList);
	}

}
