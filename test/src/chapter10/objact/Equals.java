package chapter10.objact;

class Student implements Cloneable{
	int studentNum;
	String studentName;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentName == std.studentName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}


public class Equals {

	public static void main(String[] args) throws CloneNotSupportedException {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		//2개의 문자열이 같은가를 확인하는 equals
		//클래스가 오버라이딩하게 되면 같은 것이다.
		System.out.println(str1.equals(str2));
	
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student shin = new Student(100, "이순신");
		
		System.out.println(Lee == shin);
		System.out.println(Lee.equals(shin));
		
		System.out.println(Lee);
		System.out.println(Lee.hashCode());
		System.out.println(shin.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		Student clone = new Student(1000,"클롱");
		
		System.out.println(clone);
		
		Student clone2 = (Student)clone.clone();
		System.out.println(clone2);
	}
}
