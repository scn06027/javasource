package interfaceTest;

public class RemoteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc= new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		
		rc.turnOn();
		rc.turnOff();

	}

}
