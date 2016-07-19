package Problem19;
public class Problem19 {

	public static void main(String[] args) {
		BinaryTreeNode p1 =new BinaryTreeNode();
		BinaryTreeNode p2 =new BinaryTreeNode();
		BinaryTreeNode p3 =new BinaryTreeNode();
		BinaryTreeNode p4 =new BinaryTreeNode();
		BinaryTreeNode p5 =new BinaryTreeNode();
		BinaryTreeNode p6 =new BinaryTreeNode();
		BinaryTreeNode p7 =new BinaryTreeNode();
		p1.value=8;
		p2.value=6;
		p3.value=10;
		p4.value=5;
		p5.value=7;
		p6.value=9;
		p7.value=11;
		p1.pleft = p2;
		p1.pright = p3;
		p2.pleft =p4;
		p2.pright = p5;
		p3.pleft =p6;
		p3.pright=p7;
		
		Problem19 p = new Problem19();
		System.out.println("¶þ²æÊ÷£º");
		p.print(p1);
		p.MirrorRecursively(p1);
		System.out.println("¾µÏñ¶þ²æÊ÷£º");
		p.print(p1);

	}
	
	public void MirrorRecursively(BinaryTreeNode pNode){
		if(pNode == null||pNode.pleft==null && pNode.pright==null){
			return;
		}
		BinaryTreeNode ptemp =null;
		ptemp = pNode.pleft;
		pNode.pleft = pNode.pright;
		pNode.pright = ptemp;
		
		if(pNode.pleft!=null){
			MirrorRecursively(pNode.pleft);
		}
		if(pNode.pright!=null){
			MirrorRecursively(pNode.pright);
		}
	}
	public void print(BinaryTreeNode pNode){
		System.out.println(pNode.value+" ");
		if(pNode.pleft!=null){
			print(pNode.pleft);
		}
		if(pNode.pright!=null){
			print(pNode.pright);
		}
	}

}
class BinaryTreeNode{
	int value;
	BinaryTreeNode pleft;
	BinaryTreeNode pright;
}
