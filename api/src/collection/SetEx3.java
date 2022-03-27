package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Member> set= new HashSet<Member>();
		
		set.add(new Member("hong", "홍길동", "hong123"));
		set.add(new Member("kong", "콩길동", "kong123"));
		set.add(new Member("pong", "퐁길동", "pong123"));
		set.add(new Member("jong", "종길동", "jong123"));
		set.add(new Member("jong", "종길동", "jong123"));
		
		System.out.println(set); //왜 중복 저장이 되는거임?
		
		

	}

}
