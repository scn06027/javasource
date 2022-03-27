package basic;

//크기
//byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)

//형변환
//자동형변환(promotion) : 개발자가 신경쓰즤 않아도 됨
// 큰 크기의 타입 = 작은 크기 타입
//강제형변환(Casting) : 컴파일 오류와 관련이 있기 때문에 신경을 써줘야됨
//				작은 크기 타입 =(작은 크기 타입) 큰 크기 타입
public class PromotionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte byteValue= 10;
//자동 형 변환 (byte->int)
int intValue=byteValue;
System.out.println(intValue);

	char charValue='A';

	intValue=charValue;
	System.out.println(intValue);
	
	
	intValue=500;
	long longValue=intValue;
	System.out.println(longValue);
	
	float floatValue=intValue;
	System.out.println(floatValue);
	
	floatValue=35.2f;
	double doubleValue=floatValue;
	System.out.println(doubleValue);
	
	
	int v1=10;
	double d1= 5.5;
	
	double d2=v1+d1;
//	int d3=v1+d1;
	System.out.println("d2= "+d2);
	}

}
