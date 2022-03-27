package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(6);
		
		System.out.println(list);
		//Arrays.sort()는 배열일때만 가능하다..
		//Collections.sort:컬렉션프레임워크~!
		Collections.sort(list);
		System.out.println(list);
		//삭제?
		for (int i = list.size()-1; i>=0; i--) {
			if(list.contains(list.get(i))) //list.get으로 값을 가져와서 만약 값이 있으면 삭제하겠다.
				list.remove(i);
		}
		
		System.out.println(list); //다 삭제됨 
		
	}

}
