package condition;
//조건이 여러개인경우..
/*
 * if(조건)
 * {}else if{}
 * else{}
 * */
public class IfEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//점수가90 이상이면 A
		int num=85;
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80) {
			System.out.println("B");
			
		}else if(num>=70) {
			System.out.println("C");
		}else if(num>=60) {
			System.out.println("D");
		}
	//얘네한덩어리다아.
	}

}
