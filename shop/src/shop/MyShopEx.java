package shop;

public class MyShopEx {

	public static void main(String[] args) {
		//Ishop shop=new MyShop(); 
		MyShop shop= new MyShop();
		//상호지정
		shop.setTitle("멍멍냥냥");
		//고객(user)생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		//문열자
		shop.start();
		
		
	}
	
}
