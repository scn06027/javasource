package array;

//배열: 같은 타입, 연속적으로 저장= >heap 공간에 저장 (new 키워드 필요)
//				기본값으로 초기화를 해줌(정수:0, 실수:0.0, boolean: false)
public class ArrayEx1 {

	public static void main(String[] args) {
		//5개 변수(정수타입)
		int num1=3, num2=4,num3=4,num4=5,num5=6;
		int num6;
		
		//The local variable num6 may not have been initialized
		//local 변수는 반드시 초기화 과정이 필요하다.
		//System.out.println(num6);
		
		//배열 선언 및 생성
		int arr[]=new int[5];
		System.out.println(arr);
		//System.out.println(arr[1]); //index 번호는 0번부터 시작.
		//int arr[]= {3,4,5,6,7}
		
		//새로운 값 저장
		arr[0]=78;
		arr[2]=77;
		arr[4]=80;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
