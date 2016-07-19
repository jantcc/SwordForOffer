package Problem15;

public class Problem15 {

	public static void main(String[] args) {
		Problem15 p = new Problem15();
		ListNode p1 = new ListNode();
		ListNode p2 = new ListNode();
		ListNode p3 = new ListNode();
		ListNode p4 = new ListNode();
		ListNode p5 = new ListNode();
		ListNode p6 = new ListNode();
		p1.data=1;
		p2.data=2;
		p3.data=3;
		p4.data=4;
		p5.data=5;
		p6.data=6;
		p1.nextNode = p2;
		p2.nextNode = p3;
		p3.nextNode = p4;
		p4.nextNode = p5;
		p5.nextNode = p6;
		ListNode pp = p.findKthToTail(p1, 4);
		System.out.println(pp.data);
	}
	public ListNode findKthToTail(ListNode Head,int k){
		if(Head==null||k==0) return null;
		ListNode pHead = Head;
		ListNode pEnd = null;
		for(int i=0;i<k-1;i++){
			    if(pHead.nextNode!=null){
			    pHead = pHead.nextNode;
			    }else{
			    	return null;
			    }
		}
		pEnd = Head;
		while(pHead.nextNode!=null){
			pHead = pHead.nextNode ;
			pEnd = pEnd.nextNode ;
		}
		return pEnd;
	}
}

class ListNode
{
	int data;
	ListNode nextNode;
}

