package Lecture_13_Binary_Trees;
import java.util.*;

// Recusively 

public class BinaryTreeUse {
	public static BInaryTreeNode<Integer>takeInput(Scanner s) {
		int rootdata ;
		System.out.println("Enter the root data");
		rootdata = s.nextInt() ;
		if ( rootdata == -1) {
			return null ;
		}
		BInaryTreeNode<Integer> root = new BInaryTreeNode<Integer>(rootdata) ;
		root.left = takeInput(s) ;
		root.right = takeInput(s) ;
		return root ;
	}
	
	public static void printTree(BInaryTreeNode<Integer>root) {
		if ( root == null) {
			return ;
		}
		String s = root.data + " " ;
		if ( root.left != null) {
			s = s+ "L" + root.left.data + "," ;
		}
		if ( root.right != null) {
			s = s+ "R" + root.right.data + " " ;
		}
	System.out.println(s);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		BInaryTreeNode<Integer> root = takeInput(s) ;
		printTree(root);
		

	}

}
