package classtest;

import java.util.Arrays;

public class MethodTestEx {

	public static void main(String[] args) {
		
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		MethodTest1 obj= new MethodTest1();
		
		System.out.println(obj.sum(2, 3));
		
		char i=obj.method1();
		System.out.println(i);
		
		int value= i+1;
		System.out.println(value);
		
		System.out.println(obj.divide1(5.0f, 2.0f));
		
		
	
		int sample[]= {1,2,3,4,5};
		int sample2[]=obj.array(sample);
	System.out.println(Arrays.toString(sample));
	
	}

}
