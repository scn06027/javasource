package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//과사에서 전화온거 보고 잠이 훅 ! 깼음
/*	Stack
 * 마지막에 저장한 데이터를 가장 먼저 꺼낸다. => LIFO 라스트인퍼스트아웃
 * 
 * push():삽입 , pop(): 인출, empty()
 * 
 * 
 * Queue?
 * 처음에 저장한 데이터를 가장 먼저 꺼냄=> FIFO 퍼스트인퍼스트아웃
 * offer():삽입,poll(): 인출,
 * 
 */
public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> stack=new Stack();
		Queue<String> queue=new LinkedList<String>(); //큐가 인터페이스라서 이렇게 해줘야됨
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4"); //제일 위에 있는거 "4", 제일 아래에 있는게 "0"
		
		
		
		queue.offer("10");
		queue.offer("9");
		queue.offer("8");
		queue.offer("7");
		queue.offer("6");
		
		//스택인출
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
			
		}
		
		System.out.println();
		//큐인출
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}
		
		System.out.println("\n"+stack); //다 꺼내버려가지고 텅 비어있음
	}

}
