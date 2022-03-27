package exam;

public class Add extends Calc {
	
	
	
	public Add(int a, int b) {
		// TODO Auto-generated constructor stub
		setValue(a, b);
	}
	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}

}
