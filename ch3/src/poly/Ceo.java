package poly;

public class Ceo extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+
	super.getPosition()+" 일을 합니다. ");
	}
}
