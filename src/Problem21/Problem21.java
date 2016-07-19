package Problem21;

import java.util.Stack;

public class Problem21 {
      public static void main(String[] args) {
		 MyStack myStack = new MyStack();
		 myStack.push(5);
		 myStack.push(4);
		 myStack.push(2);
		 myStack.push(6);
		 myStack.push(1);
		 myStack.push(1);
		 myStack.push(10);
		
		 System.out.println(myStack.min());
	}
}

class MyStack{
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> stackhelp = new Stack<Integer>();
	public void push(int i){
		stack.push(i);
		if(stack.size()==1){
			stackhelp.push(i);
		}else{
			int temp = stackhelp.pop();
			boolean flag = false;
			if(i<=temp){
				flag = true;
			}
			if(flag){
				stackhelp.push(temp);
			    stackhelp.push(i);
			}else{
				stackhelp.push(temp);
			}
		}
	}
	public int pop(){
		int stackPopElement = stack.pop();
		int stackhelpPopElement = stackhelp.pop();
		if(stackPopElement!=stackhelpPopElement){
			stackhelp.push(stackhelpPopElement);
		}
		return stackPopElement;
	}
	public int min(){
		return stackhelp.pop();
	}
}
