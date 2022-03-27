package classtest;

public class CardEx {
	
	public static void main(String[] args) {
	
		
		System.out.println("width : "+Card.width);
		System.out.println("height : "+Card.height);
		Card card1=new Card("Heart",7);
	Card card2=new Card("spade",4);
	Card card3=new Card("diamond",5);
	
	System.out.println("card1 kind= "+card1.kind+" , "
			+ "card1 number= "+card1.number+"," 
			+"card1 width= "+card1.width+
		 ", card1 height = "+card1.height);
	
	System.out.println("card2 kind= "+card2.kind+" , "
			+ "card2 number= "+card2.number+"," 
			+"card2 width= "+card1.width+
		 ", card2 height = "+card1.height);
	
	Card.height=80;
	Card.width=50;
	
	System.out.println("card3 kind= "+card3.kind+" , "
			+ "card3 number= "+card3.number+"," 
			+"card3 width= "+Card.width+
		 ", card3 height = "+Card.height);
	
	}
}
