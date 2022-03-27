package condition;

import java.util.Iterator;


/*
 * 반복문:
 * 어떤 작업이 반복적으로 실행되도록 할 때 사용한다
 * for /while /do ~ while
 * */
public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <10; i++) {
//①			int i가 제일 먼저 실행된다. (딱 한번 실행됨)
//②			i<10; <-이게 true로 나올때까지만 실행됨
//③		for블럭 안으로 진입한다. { 요 안에 들어있는 걸}실행
//④			i++ (i=i+1)
//⑤			1<10 이 되는거임 (첫번째 회전)
//⑥			이거 계속 반복			
//⑦...
//⑧			이러게 하다가 i가 10이 돼버렸음. true가 아니니까 반복문이 종료됨
			System.out.println("안녕하세요"+i);
		}
		
	}

}
