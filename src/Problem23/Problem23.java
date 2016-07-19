package Problem23;

import java.util.LinkedList;
import java.util.Queue;



public class Problem23 {
	Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
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
		Problem23 problem23 = new Problem23();
		problem23.LevelTraversal(p1);
	}
	
	public void LevelTraversal(BinaryTreeNode root){
		System.out.println(root.value);
		if(root.pleft!=null){
			queue.add(root.pleft);
		}
		if(root.pright!=null){
			queue.add(root.pright);
		}
		BinaryTreeNode node = queue.poll();
		if(node==null){
			return;
		}
		LevelTraversal(node);
	}

}



class BinaryTreeNode{
	int value;
	BinaryTreeNode pleft;
	BinaryTreeNode pright;
}