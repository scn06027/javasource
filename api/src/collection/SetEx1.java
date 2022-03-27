package collection;

import java.util.HashSet;
import java.util.Set;

/*	Set
 * 순서가 없다
 * 중복 허용 안한다.
 * 
 * HashSet, TreeSet
 */
public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		
		//순서 없이 저장
		set.add("Java");
		set.add("Jsp");
		set.add("Jdk");
		set.add("Servlet");
		set.add("Oracle");
		set.add("Oracle"); //안됨 ㅋ 
		
		System.out.println(set);
	}

}
