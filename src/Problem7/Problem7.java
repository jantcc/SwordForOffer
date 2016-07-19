package Problem7;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Problem7 {

	public static void main(String[] args) {
		myQueue queue = new myQueue();
		//入队
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
	
		System.out.println(queue.delete());

		System.out.println(queue.delete());
		

		System.out.println(queue.delete());
	}
	
	

}

class myQueue {
	Queue queue = null;
	Stack stack1 =null;
	Stack stack2 =null;
	public myQueue(){
		queue = new LinkedList();
		stack1 = new Stack();
		stack2 = new Stack();
	}
	public void insert(int num){
		stack1.push(num);
	}
	public int delete(){
		if(stack2.size()<=0){
			while(stack1.size()>0){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new RuntimeException("队列为空!不能进行删除操作");
		}
		
		int popdata = (int)stack2.pop();
		return popdata;
	}
	
}