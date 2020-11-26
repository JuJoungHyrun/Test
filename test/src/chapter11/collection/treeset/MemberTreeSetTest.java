package chapter11.collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberKim = new Member(200,"Kim");
		Member memberLee = new Member(100,"Lee");
		Member memberPark = new Member(300,"Park");
		
		//chapter11.collection.treeset.Member cannot be cast to java.lang.Comparable
		//add 할때 멤버를 어떻게 비교해야 할지 모르겠다
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
	}

}
