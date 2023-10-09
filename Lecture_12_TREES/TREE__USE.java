package Lecture_12_TREES;

import java.util.Scanner;
//  TAKE AND PRINT INPUT RECURRSIVELY

public class TREE__USE {
	public static TreeNode<Integer> takeInput(Scanner s){
	      int n ;
		 System.out.println("Enter the next node data : "); 
		 n = s.nextInt() ;
		 TreeNode<Integer> root = new TreeNode<Integer>(n) ;
		 System.out.println("Enter number of children for Node " + n);
		 int childcount = s.nextInt();
		 for ( int i = 0 ; i < childcount ; i++) {
			 TreeNode<Integer> child  = takeInput(s) ;
			 root.children.add(child) ;
		 }
		 return root ;
	}
	
	public static void Print(TreeNode<Integer>root) {
		String s = root.data + ";" ;
		for ( int i = 0 ; i < root.children.size() ; i++) {
			s = s + root.children.get(i).data + "," ;
		}
		System.out.println(s);
		for ( int i = 0 ; i < root.children.size() ; i++) {
			Print(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		TreeNode<Integer> root = takeInput(s) ;
		Print(root);
	}

}
