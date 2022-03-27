package condition;

public class DiceSum {
	public static void main(String[] args) {
		
		int dice1=0,dice2=0;
	
		while(true) {
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		
		if((dice1+dice2)!=5) {
			System.out.printf("%d+%d=%d\n",dice1,dice2,dice1+dice2);
			continue;
		}else {
			System.out.printf("%d+%d=%d\n",dice1,dice2,dice1+dice2);
			System.out.println("합이 5이므로 시스템 종료");
			break;
		}
		
		
		}
		
		
	}

}
