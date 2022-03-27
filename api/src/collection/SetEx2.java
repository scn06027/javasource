package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// 로또번호?!
		
		Set<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; set.size()<6; i++) { //이게 뭔뜻?
			
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println("이번 로또 번호는?>> "+set);
		
		//정렬한다음에 화면 출력하고싶다ㅏ 배고프다 
		
		List<Integer> list=new ArrayList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
