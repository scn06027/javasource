package collection;

public class Member {
	private String id,name,password;

	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Set에서 중복저장이 안되게 하는방법쓰
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode(); //이건 뭐임? 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem=(Member)obj;
	return this.id.equals(mem.id); //id끼리 비교하자~!
		}
		return false;
	}
}
