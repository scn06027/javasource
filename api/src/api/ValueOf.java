package api;

public class ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b=String.valueOf(false);
		System.out.println(b); //"false"
		
		String c=String.valueOf('c');
		System.out.println(c);//"c"
		
		String f1=String.valueOf(10f);
		System.out.println(f1);//"10.0"
		
		String l=String.valueOf(10L);
		System.out.println(l);//10
		
		//다 문자로 바꼈다는 소리임
		
		//'b'를 boolean 타입으로 바꾸고싶음.
		 boolean b1=Boolean.parseBoolean(b);
		 
		 float f2=Float.parseFloat(f1);
	}

}
