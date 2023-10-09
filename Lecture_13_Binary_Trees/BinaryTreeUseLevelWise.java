package Lecture_13_Binary_Trees;

import java.util.Scanner;

public class BinaryTreeUseLevelWise {
	
	public static BInaryTreeNode<Integer>takeInputLevelwise(){
		Scanner s = new Scanner(System.in) ;
		QueueUsingLL<BInaryTreeNode<Integer>> q  =  new QueueUsingLL<>() ;
		System.out.println("Enter the root data"); ;
		int rootdata = s.nextInt() ;
		if ( rootdata == -1) {
			return null ;
		}
		BInaryTreeNode<Integer> root  = new BInaryTreeNode<Integer>(rootdata) ;
		q.enqueue(root);
		BInaryTreeNode<Integer> front ;
		while ( !q.isEmpty()) {
		    try {
				front = q.dequeue() ;
			}
			catch (QueueEmptyException e) {
			return null ;
			}
		    System.out.println("Enter the left child of "+ front.data);
		    int Lchild = s.nextInt() ;
		    if (Lchild != -1) {
		    	BInaryTreeNode<Integer>leftchild = new BInaryTreeNode<Integer>(Lchild) ;
		    	q.enqueue(leftchild);
		    	front.left= leftchild ;
		    }
		    System.out.println("Enter the Right child of "+ front.data);
		    int Rchild = s.nextInt() ;
		    if (Rchild != -1) {
		    	BInaryTreeNode<Integer>Rightchild = new BInaryTreeNode<Integer>(Rchild) ;
		    	q.enqueue(Rightchild);
		    	front.right= Rightchild ;
		    } 
		}
		return root ;
	}
	public static void PrintLevelWise(BInaryTreeNode<Integer>root) {

		if ( root == null) {
			return ;
		}
		QueueUsingLL<BInaryTreeNode<Integer>> q = new QueueUsingLL<>() ;
		q.enqueue(root);
		while ( !q.isEmpty()) {
			BInaryTreeNode<Integer>front ;
			try {
				front = q.dequeue() ;
				System.out.print(front.data + " ");
				if ( front.left != null) {
					q.enqueue(front.left);
					System.out.print("L" + front.left.data + ",");
				}
				else {
					System.out.print("L" + "-1" + ",");
				}
				if ( front.right != null) {
					q.enqueue(front.right);
					System.out.print("R" + front.right.data );
					System.out.println();
				}
				else {
					System.out.print("R" + "-1" );
					System.out.println();
				}
				
			} catch (QueueEmptyException e) {
				return ;
			}
		}
	}
    public static int countNodes (BInaryTreeNode<Integer>root) {
    	if ( root == null ) {
    		return 0 ;
    	}
    	int count = 1 ;
    	count = count + countNodes(root.left) ;
    	count = count + countNodes(root.right) ;
    	return count ;
    }
	public static int SumofNodes( BInaryTreeNode<Integer> root) {
		if ( root == null) {
			return 0 ;
		}
		int sum = root.data ;
		sum = sum + SumofNodes(root.left) ;
		sum = sum + SumofNodes(root.right) ;
		return sum ;
	}
    public static boolean isNodePresent ( BInaryTreeNode<Integer>root , int x) {
    	if ( root == null ) {
    		return false ;
    	}
    	if ( root.data == x) {
    		return true ;
    	}
    	return(isNodePresent(root.left, x) || isNodePresent(root.right, x)) ;
    }
	public static int NUmofNodesGreaterThanX( BInaryTreeNode<Integer>root ,int x) {
		if ( root == null) {
			return 0 ;
		}
		int count = 0 ;
		if ( root.data > x) {
			count++ ;
		}
		count = count + NUmofNodesGreaterThanX(root.left, x) ;
		count = count + NUmofNodesGreaterThanX(root.right, x) ;
		
		return count  ;
	}
	public static int NodeWithLargestData(BInaryTreeNode<Integer>root) {
		if ( root == null) {
			return -1 ;
		}
		int largestleft = NodeWithLargestData(root.left) ;
		int largestRight  = NodeWithLargestData(root.right) ;
		
		int a = Math.max(largestleft, largestRight) ;
		int b = Math.max(root.data, a) ;
		return b ;
//		return  Math.max(root.data , Math.max(largestleft, largestRight)) ;

	}
    public static int Height( BInaryTreeNode<Integer> root) {
    	if ( root == null ) {
    		return 0 ;
    	}
    	int heightleft = Height(root.left) ;
    	int heightright = Height(root.right) ;
    	int count = Math.max(heightleft, heightright) ;
    	return count+ 1 ;
    }
	public static int LeafNode( BInaryTreeNode<Integer>root) {
		if ( root == null) {
			return 0 ; 
		}
		if ( root.left == null  && root.right == null) {
			return 1 ;
		}
		 return (LeafNode(root.left) + LeafNode(root.right)) ;
	}
	public static void PrintAtDepthK(BInaryTreeNode<Integer>root , int k) {
		if ( root == null) {
			return ;
		}
		if ( k == 0) {
			System.out.println(root.data);
		}
		PrintAtDepthK(root.left, k-1);
		PrintAtDepthK(root.right, k-1);
	}
	public static void ReplaceNodeWithDepth( BInaryTreeNode<Integer>root ) {
		helpReplaceNodeWithDepth( root , 0) ;
		PrintLevelWise(root);
	}
	public static void helpReplaceNodeWithDepth(BInaryTreeNode<Integer>root , int depth) {
		if ( root == null) {
			return ;
		}
		root.data = depth ;
		helpReplaceNodeWithDepth(root.left, depth+ 1);
		helpReplaceNodeWithDepth(root.right, depth+1);
		
	}
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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BInaryTreeNode<Integer> root = takeInputLevelwise() ;
		PrintLevelWise(root); 
		System.out.println("Number of Nodes " + countNodes(root)); 
		System.out.println("Sum of Nodes" + SumofNodes(root));
		System.out.println("is Node Present " + isNodePresent(root, 3));
		System.out.println( "Num of Nodes Greater Than 3 are " + NUmofNodesGreaterThanX(root, 3));
		System.out.println("Node with largest data" + NodeWithLargestData(root));
		System.out.println("Height of a BinaryTree" + Height(root));
		System.out.println("Num of Leaf Node in Tree " + LeafNode(root));
		System.out.println("Print at Depth K" ); 
		PrintAtDepthK(root, 2) ;
		System.out.println("Replace Node with Depth" );	
		 ReplaceNodeWithDepth(root) ;
        System.out.println("Node without Sibling " );
        PrintNOdeWithoutSibling(root) ;
	}

}
