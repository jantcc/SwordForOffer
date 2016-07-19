package Problem17;


public class Problem17 {

	public static void main(String[] args) {
		Problem17 p = new Problem17();
		ListNode head1=new ListNode();
		ListNode second1=new ListNode();
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode third2=new ListNode();
		head1.nextNode=second1;	
		head2.nextNode=second2;
		second2.nextNode=third2;
		head1.data=1;
		second1.data=3;
		head2.data=2;
		second2.data=2;
		third2.data=2;
		
		ListNode pNode = p.merGe(head1, head2);
		System.out.println(pNode.data);
	}
	
	public ListNode merGe(ListNode head1,ListNode head2){
		if(head1==null)
			return head2;
		else 
			if(head2==null)
				return head1;
		ListNode curpHead =null;
		if(head1.data<=head2.data){
			curpHead = head1;
			curpHead.nextNode = merGe(head1.nextNode,head2);
		}else {
			curpHead = head2;
			curpHead.nextNode=merGe(head1, head2.nextNode);
		}
		return curpHead;
	}

}

class ListNode
{
	int data;
	ListNode nextNode;
}