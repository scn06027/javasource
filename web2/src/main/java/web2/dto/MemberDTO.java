package web2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//테이블과 똑같이 작성하면 된다!

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString

public class MemberDTO {
	private int id,age;
	private String name,addr,email;
	public MemberDTO(int age, String name, String addr, String email) {
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
		this.email = email;
	}
	
	
	
}
