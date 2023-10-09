package Lecture_14_Binary_Trees_2;

import java.util.*;

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
    public static int Height( BInaryTreeNode<Integer> root) {
    	if ( root == null ) {
    		return 0 ;
    	}
    	int heightleft = Height(root.left) ;
    	int heightright = Height(root.right) ;
    	int count = Math.max(heightleft, heightright) ;
    	return count+ 1 ;
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
	public static BInaryTreeNode<Integer>removeLeafNodes(BInaryTreeNode<Integer>root){
		if (root == null) {
			return null ;
		}
		if ( root.left == null && root.right == null) {
			return null ;
		}
		root.left = removeLeafNodes(root.left) ;
		root.right = removeLeafNodes(root.right) ;
		return root ;
	}
	public static boolean checkBalancedBinaryTree(BInaryTreeNode<Integer>root){
		if (root == null)
			return true ;
		int leftHeight = Height(root.left) ;
		int rightHeight = Height(root.right) ;
		
		if ((Math.abs(rightHeight - leftHeight)>1) ) {
			return false ;
		}
		boolean leftBlanaced = checkBalancedBinaryTree(root.left) ;
		boolean rightBalanced = checkBalancedBinaryTree(root.right) ;
		
		return leftBlanaced&&rightBalanced ;
	}
	public static BalanceTreeReturn checkBalancedBinaryTreeBetter(BInaryTreeNode<Integer>root) {
		if ( root ==null) {
			int height = 0 ;
			boolean IsBalanced = true ;
 			BalanceTreeReturn ans = new BalanceTreeReturn() ;
			ans.height = height ;
			ans.IsBalanced = IsBalanced ;
			return ans ;
		}
		BalanceTreeReturn leftOutput = checkBalancedBinaryTreeBetter(root.left ) ;
		BalanceTreeReturn rightOutput = checkBalancedBinaryTreeBetter(root.right) ;
		boolean IsBalanced = true ;
		int height = 1 + Math.max(leftOutput.height, rightOutput.height) ;
		if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
			IsBalanced = false ;
		}
		if ( !leftOutput.IsBalanced || !rightOutput.IsBalanced) {
			IsBalanced = false ;
		}
		BalanceTreeReturn ans = new BalanceTreeReturn() ;
		ans.height = height ;
		ans.IsBalanced = IsBalanced ;
			return ans ;
		
	}
	public static int Diameter (BInaryTreeNode<Integer>root) {
		if ( root == null)
			return 0 ;
		
		int Option1 = Height(root.left) + Height(root.right) ;
		int Option2 = Diameter(root.left ) ;
		int Option3 = Diameter(root.right) ;
		
		return Math.max(Option1, Math.max(Option2, Option3) ) ;
	}
	public static PairDiameter  Diameterbetter(BInaryTreeNode<Integer>root) {
		if ( root == null ){
			PairDiameter output = new PairDiameter() ;
			output.Height = 0 ;
			output.Diameter = 0 ;
			return output ;
		}
		PairDiameter leftAns = Diameterbetter(root.left) ;
		PairDiameter rightAns = Diameterbetter(root.right) ;
		  
		int HEIGHT = 1 + Math.max(leftAns.Height, rightAns.Height) ;
		int Option1 = leftAns.Diameter + rightAns.Diameter ;
		int Option2 = leftAns.Diameter ;
		int Option3 = rightAns.Diameter ;
		
		int DIAMETER = Math.max(Option1, Math.max(Option2, Option3) ) ;
		
		PairDiameter ans = new PairDiameter() ;
		ans.Height = HEIGHT ;
		ans.Diameter = DIAMETER ;
		return ans ;
	}
	public static void Mirror(BInaryTreeNode<Integer>root) {
		if ( root == null)
			return ;
		
		Mirror(root.left);
		Mirror(root.right);
		
		BInaryTreeNode<Integer> temp = root.left  ;
		root.left = root.right ;
		root.right = temp ;
		return ;
		
	}
	public static void InOrder(BInaryTreeNode<Integer>root) {
	if (root == null)
		return ;
	
	InOrder(root.left);
	System.out.print(root.data + " ");
	InOrder(root.right);
	
	}
    public static void PreOrder(BInaryTreeNode<Integer>root) {
	if (root == null)
		return ;
	System.out.print(root.data + " ");
	PreOrder(root.left);
	PreOrder(root.right);
	
	}
    public static void PostOrder(BInaryTreeNode<Integer>root) {
    	if (root == null)
    		return ;
    	
    	PostOrder(root.left);
    	PostOrder(root.right);
    	System.out.print(root.data + " ");
}

    
    
    public static BInaryTreeNode<Integer>buildTreeWithIn_PRe(int[] In , int [] Pre){
    	return HELPERbuildTreeWithIn_Pre(In, Pre ,0 , In.length-1 , 0 , Pre.length-1 ) ;
    }
    public static BInaryTreeNode<Integer> HELPERbuildTreeWithIn_Pre(int[] In , int[]Pre ,int InS , int InE , int PreS , int PreE ){
    	if (InS > InE) {
    		return null ;
    	}
    	int rootdata = Pre[PreS] ;
    	BInaryTreeNode<Integer>root = new BInaryTreeNode<Integer>(rootdata) ;
    	int rootIndex = -1 ;
    	for ( int i = InS ; i<= InE ; i++) {
    		if (In[i] == rootdata) {
    			rootIndex = i ;
    			break ;
    		}
    	}
    	
    	int leftInS = InS ;
    	int leftInE = rootIndex -1 ;
    	int leftPreS = PreS + 1 ;
    	int leftPreE  = leftInE - leftInS + leftPreS ;
    	
    	int rightInS  = rootIndex + 1;
    	int rightInE  = InE;
    	int rightPreS  = leftPreE + 1;
    	int rightPreE  = PreE ;
    	
    	root.left = HELPERbuildTreeWithIn_Pre(In, Pre, leftInS, leftInE, leftPreS, leftPreE) ;
    	root.right = HELPERbuildTreeWithIn_Pre(In, Pre, rightInS, rightInE, rightPreS, rightPreE) ;
    	
    	return root ;
    }
    
    public static BInaryTreeNode<Integer>buildTreeWithIn_Post(int[] In , int [] Post){
    	return HELPERbuildTreeWithIn_Post(In, Post ,0 , In.length-1 , 0 , Post.length-1 ) ;
    }
    public static BInaryTreeNode<Integer> HELPERbuildTreeWithIn_Post(int[] In , int[]Post ,int InS , int InE , int PostS , int PostE ){
    	if ( InS > InE) {
    		return null ;
    	}
    	int rootdata = Post[PostE] ;
    	BInaryTreeNode<Integer>root = new BInaryTreeNode<Integer>(rootdata) ;
    	int rootIndex = -1 ;
    	for ( int i = InS ; i <= InE ; i++) {
    		if ( In[i] == rootdata) {
    			rootIndex = i ;
    			break ;
    		}
    	}
    	int leftInS = InS ;
    	int leftInE = rootIndex -1 ;
    	int leftPostS = PostS  ;
    	int leftPostE  = PostS + InE - InS ;
    	
    	int rightInS  = rootIndex + 1;
    	int rightInE  = InE;
    	int rightPostS  = PostS + rootIndex - InS;
    	int rightPostE  = PostE - 1  ;
    	
    	BInaryTreeNode<Integer>rootleft = HELPERbuildTreeWithIn_Post(In, Post, leftInS, leftInE, leftPostS, leftPostE) ;
    	BInaryTreeNode<Integer>rootright = HELPERbuildTreeWithIn_Post(In, Post, rightInS, rightInE, rightPostS, rightPostE) ;
    	root.left = rootleft ;
    	root.right = rootright ;
    	
    	return root ; 
    }
    
   
    public static void InsertDuplicates(BInaryTreeNode<Integer>root) {
    	if (root==null)
    		 return ;
    	InsertDuplicates(root.left);
    	InsertDuplicates(root.right);
    	
    	BInaryTreeNode<Integer>root2 = new BInaryTreeNode<Integer>(root.data) ;
    	BInaryTreeNode<Integer>root3 = root.left ;
    	root.left = root2 ;
    	root2.left = root3 ;
    }
    public static void PrintlevelOrderTRaversal(BInaryTreeNode<Integer>root) {
    	if (root == null)
    		return ;
    	QueueUsingLL<BInaryTreeNode<Integer>>q = new QueueUsingLL<BInaryTreeNode<Integer>>() ;
    	q.enqueue(root);
    	q.enqueue(null); ;
    	while (!q.isEmpty()) {
    		try {
				BInaryTreeNode<Integer>front = q.dequeue() ;
				if ( front == null) {
					if ( q.isEmpty()== true) {
						break ;
					}
					else {
						System.out.println();
						q.enqueue(null);
					}
				}
				else {
					System.out.print(front.data + " ");
					q.enqueue(front.left);
				}
				if ( front.right != null) {
					q.enqueue(front.right);
				}
				if ( front.left != null) {
					q.enqueue(front.left);
				}
			} catch (QueueEmptyException e) {
				return ;
			}
    		
    	}
    	
    }

// print node at distance k from root .
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BInaryTreeNode<Integer> root = takeInputLevelwise() ;
//		PrintLevelWise(root); 
//	    BInaryTreeNode<Integer>Rootwithoutleaf = removeLeafNodes(root) ;
//	    PrintLevelWise(Rootwithoutleaf);
//		System.out.println("Is Tree balanced  " + checkBalancedBinaryTree(root));
//		System.out.println("The Diameter is " + Diameter(root));
//		Mirror(root); 
//		System.out.println("  The mirror of Tree is " );
//		PrintLevelWise(root);
//		System.out.println("  The Inorder Traversal of Tree is " );
//		InOrder(root);
//		System.out.println("  The Preorder Traversal of Tree is " );
//		PreOrder(root);
//		System.out.println("  The Postorder Traversal of Tree is " );
//		PostOrder(root);
		int In [] = {4,2,5,1,3,7} ;
		int Pre [] = {1,2,4,5,3,7} ;
		int Post[] = {4,5,2,7,3,1} ;
//		BInaryTreeNode<Integer>root2 = buildTreeWithIn_PRe(In, Pre) ;
//		PrintLevelWise(root2);
		BInaryTreeNode<Integer>newRoot = buildTreeWithIn_Post(In, Post) ;
		PrintLevelWise(newRoot);

//		System.out.println("  The Levelorder Traversal of Tree is " );
//		PrintlevelOrderTRaversal(root);
		
		


	
	}

}








