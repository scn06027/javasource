package api;

public class Member {
	private String id;

	public Member(String id) {
		
		super();
		this.id=id;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object obj) {
		// id가 같으면 true라고 넘겨주고 싶다.
		
		if(obj instanceof Member) {
			Member member =(Member)obj;
			
			if(id.equals(member.id))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "id = "+id;
	}
	
	

}
