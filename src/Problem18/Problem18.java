package Problem18;

public class Problem18 {
	public static void main(String[] args) {
		Problem18 p = new Problem18();
		BinaryTreeNode p1 =new BinaryTreeNode();
		BinaryTreeNode p2 =new BinaryTreeNode();
		BinaryTreeNode p3 =new BinaryTreeNode();
		BinaryTreeNode p4 =new BinaryTreeNode();
		BinaryTreeNode p5 =new BinaryTreeNode();
		BinaryTreeNode p6 =new BinaryTreeNode();
		BinaryTreeNode p7 =new BinaryTreeNode();
		BinaryTreeNode p8 =new BinaryTreeNode();
		p1.value=8;
		p2.value=8;
		p3.value=7;
		p4.value=9;
		p5.value=2;
		p6.value=8;
		p7.value=9;
		p8.value=2;
		p1.pleft = p2;
		p1.pright = p3;
		p2.pleft =p4;
		p2.pright = p5;
		p6.pleft = p7;
		p6.pright = p8;
		boolean flag = p.hasSubTree(p1, p6);
		System.out.println("Tree1ÊÇ·ñ°üº¬Tree2£º"+flag);
	}
	
	public boolean hasSubTree(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2){
		boolean result = false;
		if(pRoot1!=null && pRoot2!=null){
			if(pRoot1.value==pRoot2.value){
				result = DoesTree1HaveTree2(pRoot1,pRoot2);
			}
			if(!result){
				result = hasSubTree(pRoot1.pleft, pRoot2);
			}
			if(!result){
				result = hasSubTree(pRoot1.pright, pRoot2);
			}
		}
		return result;
	}

	private boolean DoesTree1HaveTree2(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
		if(pRoot2==null){
			return true;
		}
		if(pRoot1==null){
			return false;
		}
		if(pRoot1.value!=pRoot2.value){
			return false;
		}
		return DoesTree1HaveTree2(pRoot1.pleft, pRoot2.pleft) && DoesTree1HaveTree2(pRoot1.pright, pRoot2.pright);
	}
}

class BinaryTreeNode{
	int value;
	BinaryTreeNode pleft;
	BinaryTreeNode pright;
}