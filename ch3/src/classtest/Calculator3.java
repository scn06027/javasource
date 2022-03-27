package classtest;

public class Calculator3 {
long a,b;

//멤버 메소드(인스턴스 메소드) 객체가 가지고 있는 메소드

long add() {
	return a+b;
}

long subtract() {
	return a-b;
}
long multiply() {
	return a*b;
}

long divide() {
	return a/b;
}

//클래스 메소드 
//공유, 객체 생성 없이 사용 가능함
//인스턴스 변수, 인스턴스 메소드 사용 불가하다.

static long add(long c,long d) {
	return c+d;
}

static long subtract (long c,long d) {
	return c-d;
}
static long multiply(long c,long d) {
	return c*d;
}

static long divide(long c,long d) {
	return c/d;
}


}
