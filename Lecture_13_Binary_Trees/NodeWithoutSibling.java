package Lecture_13_Binary_Trees;

public class NodeWithoutSibling {
	public static void PrintNOdeWithoutSibling(BInaryTreeNode<Integer>root) {
		if ( root == null) {
			return ;
		}
		if ( root.left == null && root.right == null){
			return ;
		}
			if ( root.left == null) {
				System.out.println(root.right.data + " " );
			}
			if ( root.right == null) {
				System.out.println(root.left.data + " " );
			}
			PrintNOdeWithoutSibling(root.left);
			PrintNOdeWithoutSibling(root.right);
		}
	}


