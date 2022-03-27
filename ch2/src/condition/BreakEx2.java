package condition;
//break; 반복문 수행 중지
//while(조건식){... break;}
//while (조건식){
//    while(조건식){
//			break;
//			} //내부 반복문만 빠져나감
//       }

public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6)
				break;
		}
		
	}

}
