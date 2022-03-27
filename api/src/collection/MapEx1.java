package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * Key,value 구조로 저장된다.
 * key 값은 중복이 안된다. value만 중복이 가능하다.
 */
public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>map=new HashMap<String, String>();
		
		//요소추가
		map.put("id_0123", "홍길동");
		map.put("id_0124", "콩길동");
		map.put("id_0125", "통길동");
		map.put("id_0126", "퐁길동");
		
		System.out.println("키에 해당하는 값 가져오기 "+map.get("id_0123"));
		System.out.println("키가 존재하는지 확인하기 "+map.containsKey("id_0123"));
		System.out.println("값이 존재하는지 확인하기 "+map.containsValue("콩길동"));
		System.out.println("Map이 비어있는지 확인하기 "+map.isEmpty());
		System.out.println("Map 크기 "+map.size());
		System.out.println("Map  요소 삭제 : "+map.remove("id_0126"));
		
		System.out.println(map.get("id_0126"));
		
		//키 값만 가져오기
		Set<String> keys=map.keySet();
		System.out.println(keys);
		
		//value 값만 가져오기이 
		Collection<String> values=map.values();
		System.out.println(values);
		
		System.out.println();
		
		
		Iterator<String> keyIter=keys.iterator();
		while(keyIter.hasNext()) { //keyIter에서 읽어올 요소가 있는 동안
			String key=keyIter.next();
			String value=map.get(key);
			System.out.println(key+" : "+value);
		}
	}

}
