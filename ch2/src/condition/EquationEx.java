package condition;

public class EquationEx {

	public static void main(String[] args) {
	// 4x+5y=60 x,y 해를 구하고싶음..
		//x,y는 10 이하의 자연수

		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(4*i+j*5==60) {
						System.out.printf("x의 값은 %d, y의 값은 %d\n",i,j);
				}
			}
			
		}
	
		
		
	}

}
