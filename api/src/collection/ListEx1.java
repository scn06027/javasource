package collection;

import java.util.ArrayList;
import java.util.List;
/*
 * List 인터페이스는?
 * - 순서가 있따
 * - 데이터 중복을 허용한다
 * - 구현클래스: ArrayList, Vector,LinkedList,Stack 등이 있다
 * List<E> :여기서 E는 element로, 객체로 담아야된단뜻. 
 * 동일한 틀을 가지길 원하니까...
 * 배열과동일하지만, 배열보다 좀 더 좋다.../?
 * */
public class ListEx1 {

	public static void main(String[] args) {
		//정수 : int=>Integer
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2); //중복가능
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list); //toString이 오버라이딩 돼있어서 주소가 아니라 값이 나옴 ㅇㅇ!
		
		list.add(3, 11); //3번에 11 넣어줘,
		
		System.out.println(list);
		for(Integer i:list) {
			System.out.print(i+" ");
		}
	
	}
	
	

}
