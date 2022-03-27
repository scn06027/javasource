package collection;

import java.util.LinkedList;
import java.util.List;

//ArrayList,Vector 단점을 보완
//(크기변경, 비순차적인 데이터의 추가, 삭제)에 시간이 많이 걸림.

public class ListEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		list.add("딸기");
		list.add("자몽");
		list.add("레몬");
		
		System.out.println(list);

	}

}
