package basic;
//강제 형 변환
public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=1034;
		byte byteValue=(byte)intValue; //canno convert from int to byte
		System.out.println("byteValue= "+byteValue);
int num1= 123456780;
//자동 형 변환
		double num2=num1;
		System.out.println("num2: "+num2);
		//강제 형 변환
		int num3=(int)num2;
		System.out.println("num3: "+num3);
	}

}
