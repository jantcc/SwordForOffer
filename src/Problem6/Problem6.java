package Problem6;
import java.util.Arrays;

import Problem6.*;
public class Problem6 {

	public static void main(String[] args) {
		int pre[] = {1,2,4,7};
		int in[] = {4,7,2,1};
		try {
			Problem6 a = new Problem6();
			BinaryTreeNode root = a.constructCore(pre,in);
			System.out.println(root);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	public BinaryTreeNode constructCore(int[] preorder,int[] inorder) throws Exception
	{
		boolean isHave =false;
		if(preorder==null || inorder==null)
		{
		   return null;
		}
		if(preorder.length!=inorder.length)
		{
			throw new Exception("不能构成二叉树");
		}
		BinaryTreeNode root=new BinaryTreeNode();
		for(int i=0;i<inorder.length;i++)
		{
			if(inorder[i]==preorder[0])
			{
				isHave =true;
				root.value=inorder[i];
				root.leftNode=constructCore(Arrays.copyOfRange(preorder,1,i+1)
						,Arrays.copyOfRange(inorder,0,i));
				root.rightNode=constructCore(Arrays.copyOfRange(preorder,i+1,preorder.length)
						,Arrays.copyOfRange(inorder,i+1,inorder.length));
			}
		}
		if(!isHave)
		{
			throw new Exception("不能构成二叉树");
		}
		return root;
	}
	public BinaryTreeNode constructTree(int prearr[],int inarr[]) throws Exception{
		//ex:12473568,47215386
		boolean isHave=false;
		if(prearr==null||inarr==null){
			return null;
		}
		if(prearr.length!=inarr.length){
			return null;
		}
		BinaryTreeNode root = new BinaryTreeNode();
		for(int i=0;i<inarr.length;i++){
			if(inarr[i]==prearr[0]){
				isHave=true;
				root.value=inarr[i];
				root.leftNode = constructTree(Arrays.copyOfRange(prearr, 1, i+1),Arrays.copyOfRange(inarr,0,i));
				root.rightNode = constructTree(Arrays.copyOfRange(prearr,i+1,prearr.length),Arrays.copyOfRange(inarr,i+1,inarr.length) );
			}
		}
		if(!isHave){
			throw new Exception("不能构成二叉树");
		}
		return root;
	}
}
