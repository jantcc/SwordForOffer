package Problem16;

public class Problem16 {

	public static void main(String[] args) {
		Problem16 p = new Problem16();
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		ListNode resultListNode = p.reverseList(head);
		System.out.println(resultListNode.data);

	}
	public ListNode reverseList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode reverseNode = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		while(pNode!=null){
			ListNode pNext = pNode.nextNode;
			if(pNext==null){
				reverseNode = pNode;
			}
			pNode.nextNode = pPrev;
			pPrev = pNode;
			pNode =pNext;
			
		}
		return reverseNode;
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
}