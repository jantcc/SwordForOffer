package Problem22;

import java.util.Stack;

public class Problem22 {

	public static void main(String[] args) {
		IsPopOrder isPopOrder = new IsPopOrder();
		int[] line1={1,2,3,4,5};
		int[] line2={7,4,5,2,1};
		System.out.println(isPopOrder.isPopOrder(line1, line2));
		
	}

}

 class IsPopOrder {
	 public boolean isPopOrder(int[] line1,int[] line2){
	     if(line1==null || line2==null){
	    	 return false;
	     }else{
	    	 Stack<Integer> stack = new Stack<>();
	    	 int index = 0;
	    	 for(int i=0;i<line2.length;i++){
	    		 if(!stack.isEmpty() && stack.peek()==line2[i]){
	    			 stack.pop();
	    		 }else{
	    			 if(index == line1.length){
	    				 return false;
	    			 }
	    			 do{
	    				 stack.push(line1[index++]);
	    			 }while(stack.peek()!=line2[i] && index!=line1.length);
	    			 if(stack.peek() == line2[i])
	    				 stack.pop();
	    			 else
	    				 return false;
	    		 }
    		
	    	 }
    	 
	     }	 
		 return true;
		 }

	 }
	
	
