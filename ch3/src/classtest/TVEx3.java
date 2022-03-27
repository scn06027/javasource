package classtest;

import java.util.Arrays;

public class TVEx3 {
public static void main(String[] args) {
	//TV 객체를 배열로 생성하고싶다.
	
	//타입 배열명[] = new 타입 [5];
	
	TV tvArr[]=new TV[5];
	
	System.out.println(Arrays.toString(tvArr));
	System.out.println(tvArr[0].channel);
	//TV 객체 생성한 뒤 배열에 담아보자.
//	tvArr[0]=new TV();
//	tvArr[0].channel=10;
//	
//	tvArr[1]=new TV();
//	tvArr[1].channel=10;
//	
//	tvArr[2]=new TV();
//	tvArr[2].channel=10;
//	
//	tvArr[3]=new TV();
//	tvArr[3].channel=10;
//	
//	tvArr[4]=new TV();
//	tvArr[4].channel=10;
	
	
//	int length=tvArr.length; //5
//	for (int i = 0; i < length; i++) {
//		tvArr[i]=new TV();
//		tvArr[i].channel=i+10;
//		
//	}
	
	
	
}
}
