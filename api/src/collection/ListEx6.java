package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포도");
		
		//list=>배열
		Object[] fruits=list.toArray();
		for(Object obj:fruits)
			System.out.print(obj+" ");
		
		System.out.println();
		
		//배열=>
		String f[]= {"사과","포도","멜론","수박","참외","딸기","바나나"};
		System.out.println(Arrays.toString(f));
		List<String> list1=new ArrayList(Arrays.asList(f));  //이렇게 형변환을 해줘야 먹힘
		//배열을 리스트로 바꿨는데 그 내용을 변경시켜줘야한다면
		
		list1.add("용과"); //이게 오류떴음
		
			
		//배열을 리스트로 만들어버린거라 이게 안됨
		System.out.println(list1);
	
	}

}
