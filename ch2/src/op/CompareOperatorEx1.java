package op;
//비교 연산자
// ==, !=,<,>,>=,<=
public class CompareOperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		
		
		int num2=10;
		
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<=num2);
		
		System.out.println("result1= "+result1);
		System.out.println("result2= "+result2);
		System.out.println("result3= "+result3);
		
		char ch='A';
		char ch2='B';
		int num=65;
		
		boolean result4=(ch==num);
		System.out.println("result4= "+result4);
		
		boolean result5=(ch<=ch2);
		System.out.println("result5= "+result5);
	}

}
