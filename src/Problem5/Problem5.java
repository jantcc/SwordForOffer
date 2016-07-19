package Problem5;

import java.util.Stack;

public class Problem5 {
	 int index=0;
       public static void main(String[] args) {
		Problem5 problem5 = new Problem5();
	}
       public Problem5(){
    	 ListNode listNode1 = new ListNode();
    	 ListNode listNode2 = new ListNode();
    	 ListNode listNode3 = new ListNode();
    	 listNode1.data=1;
    	 listNode2.data=2;
    	 listNode3.data=3;
    	  listNode1.next = listNode2;
    	  listNode2.next = listNode3;
    	 printListReversing(listNode1);
       }
       public void printListReversing(ListNode headNode){
    	  Stack<ListNode> stack = new Stack<ListNode>();
    	  while(headNode!=null){
    		  stack.push(headNode);
    		  headNode = headNode.next;
    	  }
    	  while(!stack.isEmpty()){
    		  System.out.println(stack.pop().data);
    	  }
       }
}

 class ListNode {
	public int data;
	public ListNode next;

}
