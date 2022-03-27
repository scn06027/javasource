package basic;
//실수형: 1.float
// 		=>부동 소수점 방식(가수 부분/ 지수 부분)

//실수형: 1.float(4byte): 부호비트 1, 지수부 8,가수부 23
//		2. double-기본타입: 부호비트 1비트, 지수부 11비트, 가수부 52비트
//						:double 타입이 실수를 더 정밀하게 표현
public class DoubleVariable {
public static void main(String[] args) {

	double d1=90.17;
	double d2=100.123d;
	System.out.println("d1= "+d1+", d2="+d2);
}
}
