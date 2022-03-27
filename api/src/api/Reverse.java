package api;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i =str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		char[] chArr=str.toCharArray();
		for (int i = chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}*/
		//Stringbuilder로 리버스 한번 해보셈
		String str="ABzquartK";
		StringBuilder builder=new StringBuilder(str);
		
			System.out.print(builder.reverse());
		
		
	}

}
