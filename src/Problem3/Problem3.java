package Problem3;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem3  p = new Problem3();
		ListNode head = new ListNode();
		ListNode second = new ListNode();
		ListNode third = new ListNode();
		head.data=1;
		second.data=2;
		third.data=3;
		head.nextNode = second;
		second.nextNode = third;
		p.deleteNode(head, second);
		System.out.println(head.nextNode);
	}
	public void deleteNode(ListNode head,ListNode deListNode){
		if(deListNode==null||head==null){
			return;
		}
		if(head==deListNode)
		{
			head=null;
		}
        if(deListNode.nextNode==null){
        	ListNode pointListNode = head;
        	while(pointListNode.nextNode.nextNode!=null){
        		pointListNode = pointListNode.nextNode;
        	}
        	pointListNode.nextNode=null;
        }else{
        	deListNode.data = deListNode.nextNode.data;
        	deListNode.nextNode = deListNode.nextNode.nextNode;
        }
		
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+"";
	}
}
