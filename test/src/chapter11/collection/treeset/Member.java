package chapter11.collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " 	+ memberId + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.getMemberId());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	/*   compable
	@Override
	public int compareTo(Member member) {
		//this 하고 나 하고 넘어온 매개변수 비교
		//양수를 반환하면 오름차순
		//음수를 반환하면 내림차순
		return (this.memberId - member.memberId);
		//이름의로 정련
		//구현된 compareTo 메소드 사용
		//this.memberName.compareTo(member.memberName);
	}
	*/
	
	// TreeSet 생성자에 비교할 객체의 디폴드 생성자를 지정해주어야한다.
	@Override
	public int compare(Member member1, Member member2) {
		return member1.memberId - member2.memberId;
	}
}
