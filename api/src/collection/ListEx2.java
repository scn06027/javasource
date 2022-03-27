package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("java");
		list.add("jsp");
		list.add("html");
		list.add("css");
		list.add("mybatis");
		
		//System.out.println(list); //toString대로 나오는거임 [  ,  ,  , ] 이렇게
		
		for (int i = 0; i < list.size(); i++) { //length대신 size() 사용
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		for(String s:list) {
			System.out.print(s+" ");
		}
	}
	

}
