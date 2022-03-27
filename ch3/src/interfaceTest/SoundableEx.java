package interfaceTest;

public class SoundableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat()); //고양이 객체 생성
		printSound(new Dog()); //강아지 객체 생성
	}
	
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound()); //고양이는 야옹, 강아지는 멍멍
	}
}
