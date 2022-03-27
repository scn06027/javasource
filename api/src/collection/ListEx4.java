package collection;

import java.util.List;
import java.util.Vector;

//ArrayList 와 Vector는 동일함.
//데이터를 읽어오고 저장하는데 효율이 좋다
//근데, 용량 변경할땐 효율이 떨어진다?! 무슨소리고?
// 기존에잇는걸 복사해야됨....
public class ListEx4 {

	public static void main(String[] args) {
		
		List<String> list=new Vector<String>(20); //20-> 크기.
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("7");
		System.out.println(list);
		
		list.clear(); //싹 다 비워버렸음
		System.out.println("clear() 후 "+list);
	}

}
