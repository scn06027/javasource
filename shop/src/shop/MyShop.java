package shop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MyShop implements Ishop {
private String title;
private User users[]=new User[2];
Scanner sc=new Scanner(System.in);
private Product products[]=new Product[5];
private Product carts[]=new Product[10];

private int selUser;
//계정 선택에서 선택한 사용자의 정보를 담기.
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title=title;
	}

	@Override
	public void genUser() {
		//유저객체를 이용하여 2명 생성 (배열을 이용한다)
		//User 생성 후 배열에 담아둬라.
		users[0]=new User("홍길동",PayType.CARD);
		users[1]=new User("성춘향",PayType.CASH);		
	}

	@Override
	public void genProduct() {
		products[0]=new CellPhone("갤럭시22", 200000, "KT");
		products[1]=new CellPhone("아이폰12", 100000, "LGU+");
		products[2]=new CellPhone("모토로라", 300000, "SKT");
		products[3]=new SmartTV("삼성티비", 120000, "4K");
		products[4]=new SmartTV("엘지티비", 98000, "1080p");
	}

	@Override
	public void start() {
		
		System.out.println(title+" : 메인 화면 - 계정 선택");
		
		System.out.println("==========================");
		int i=0;
		for (User user:users) {
			System.out.printf("[%d] %s(%s)\n",i,user.getName(),user.getPayType());
			i++;
		}
		System.out.println("[x] 종료");
		System.out.print("숫자 선택 >> ");
		String num1=sc.nextLine();
		
		//input : 0,1,x
		//switch  0,1 => productList() 호출
		//x(X)= > 프로그램종료, 다른게 입력되면 입력값을 다르게 입력해주십시오.
		//d
		
		switch (num1) {
		case "0":
		case "1":
			System.out.print("###"+num1+"선택 ###");
			selUser=Integer.parseInt(num1);
			productList();
			
		case "X":
		case "x":
			System.out.println("프로그램 종료.");
			break;
		default:
			start();
			System.out.println("입력값을 바르게 입력해주십시오.");
		}
		
		
		
	}
	
	public void productList() {
		System.out.println();
		System.out.println(title+" : 상품 목록 - 상품 선택");
		System.out.println("===========================");
		int i=0;
		for (Product product:products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 >> ");
		String num=sc.nextLine();
		//num: h:계정선택, c:체크아웃호출
		//		0~4 상품(장바구니에 담고 , 다시 한번 상품 목록을 보여준다.)
		System.out.print("번호를 하나 선택해주세요.");
		switch (num) {
		case "0":case "1": case"2": case"3": case"4": { //0~4까지 장바구니 담고 목록화면 다시한번 보여주기
			for (int j = 0; j < carts.length; j++) {
				if(carts[j]==null) {
					carts[j]=products[Integer.parseInt(num)];
					break;
				}
			}
			productList();
			break;
		}
		case "h": //start 호출
			start();
			break;
		case "c": //checkOut() 호출
			checkOut();
			break;
		default:
			System.out.println("메뉴번호를 다시한번 확인해주십시오.");
			productList();
			break;
		}
		
	}
	public void checkOut() {
		System.out.println(title+" 체크아웃");
		System.out.println("========================");
		int i=0;
		int sum=0;
		for (Product p:carts) {
			if(p!=null) {
				System.out.printf("[%d] %s(%d)\n",i++,p.getName(),p.getPrice());
				sum+=p.getPrice();
			}
		} 
		System.out.println("========================");
		System.out.println("결제 방법:"+users[selUser].getPayType());
		System.out.println("합계: "+sum+" 원 입니다.");
		System.out.println("[p] 이전 , [q] 결제완료");
		System.out.print("선택 >> ");
		String num=sc.nextLine();
		
		switch (num) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다. 감사합니다!");
			break;
		default:
			System.out.println("올바른 값을 입력해주십시오");
			productList();
			break;
		}
	}
//input: p,q
	//p:이전화면 productList(), q: 결제가 완료되었습니다. 감사합니다!
	
	

}
