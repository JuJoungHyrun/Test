package chapter11.collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(300,"Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		// String은 JDK안에서 정리되어 있어서 중복이 되지않지만
		// 만들어진 객체에는 정의가 되지 않아서 중복체크가 되지 않는다
		// 만든 객체의 equals와 hashcode를 재정의 해야한다.
		manager.addMember(memberPark2);
		
		
		manager.showAllMember();
		
	}

}
