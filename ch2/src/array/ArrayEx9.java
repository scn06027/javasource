package array;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[][]=new int[3][3];
		
		 scores[0][0]=10;
		 scores[0][1]=20;
		 scores[0][2]=30;

		 scores[1][0]=40;
		 scores[1][1]=50;
		 scores[1][2]=60;

		 scores[2][0]=70;
		 scores[2][1]=80;
		 scores[2][2]=90;
		 
		 for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
			
		
		}
		 
		 
		 	for (int score[]:scores) {
		 			for(int j:score) {
		 				System.out.print(j+" ");
		 				}	
		 				System.out.println();
		 				}
	}

}
