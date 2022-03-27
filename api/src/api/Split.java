package api;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String animals="dog,cat,bear";
		String[]arr=animals.split(","); //컴마를 기준으로 잘라서 배열로 만들어봐 ㅇㅇㅋ
		//System.out.println(Arrays.toString(arr));
		for(String s:arr)
			System.out.println(s);
		String animals1="dog cat bear";
		String[] arr1=animals1.split(" ");
		for(String s:arr1)
			System.out.println(s);
	}

}
