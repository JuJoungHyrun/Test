package chapter11.collection.treemap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberPark = new Member(300,"Park");
		Member memberLee = new Member(100,"Lee");
		Member memberKim = new Member(200,"Kim");
		//같은 키값은 들어갈수 없다.
		Member memberPark2 = new Member(400,"Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

}
