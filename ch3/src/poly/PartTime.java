package poly;

public class PartTime extends Employee {
	@Override
	public void work() {
		System.out.println(super.getName()+" "+
	super.getPosition()+" 파트타임 일을 합니다. ");
	}
}
