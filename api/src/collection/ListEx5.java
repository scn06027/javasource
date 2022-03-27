package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		List<Member> list=new ArrayList<Member>();
		
		list.add(new Member("hong", "홍길동", "hong123"));
		list.add(new Member("kong", "콩길동", "kong123"));
		list.add(new Member("pong", "퐁길동", "pong123"));
		list.add(new Member("jong", "종길동", "jong123"));

		System.out.println(list);
		//오버라이딩된 toString대로 나오는거임
		
		for(Member m:list) {
			System.out.printf("%s\t%s\t%s\n",m.getId(),m.getName(),m.getPassword());
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			Member m=list.get(i);
			System.out.printf("%s\t%s\t%s\n",m.getId(),m.getName(),m.getPassword());
		}
	}

}
