package api;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1=new Member("blue");
		Member member2=new Member("blue");
		Member member3=new Member("red");
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);

	}

}
