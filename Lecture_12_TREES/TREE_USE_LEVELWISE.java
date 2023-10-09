package Lecture_12_TREES;
import java.util.* ;
public class TREE_USE_LEVELWISE{
	public static TreeNode<Integer>takeInputLevelWise(){
		Scanner s = new Scanner (System.in) ;
		System.out.println("Enter the root data") ;
		int rootdata = s.nextInt() ;
		_02_Queue_using_LinkedList<TreeNode<Integer>> PendingNodes = new _02_Queue_using_LinkedList<>() ;
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata) ;
		PendingNodes.enqueue(root);
		while (!PendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> front = PendingNodes.dequeue() ;
				System.out.println("Enter the number of children of  " + front.data);
				int numchildren = s.nextInt() ;
				for ( int i = 0 ; i <numchildren ; i++) {
					System.out.println("Enter" + (i+1) +"th child of " + front.data);
					int child = s.nextInt() ;
					TreeNode<Integer>childnode = new TreeNode<Integer>(child) ;
					front.children.add(childnode) ;
					PendingNodes.enqueue(childnode);
				}
			
			}
			catch (QueueEmptyException e) {
				return  null ;
			}
 		}
		return root ;
	}
    public static void PrintLevelWise(TreeNode<Integer>root) {
		if (root == null) {
			return ;
		}
		_02_Queue_using_LinkedList<TreeNode<Integer>> q = new _02_Queue_using_LinkedList<>() ;
		q.enqueue(root);
		q.enqueue(null);
		while ( !q.isEmpty()) {
			try {
				TreeNode<Integer> front = q.dequeue() ;
				if (front != null) {
					System.out.print(front.data + " ");
					for ( int i = 0 ; i < root.children.size() ; i++) {
						q.enqueue(root.children.get(i));
					}
				}
				else {
					System.out.println();
					if( ! q.isEmpty()) {
						q.enqueue(null);
					}
				}
			} catch (QueueEmptyException e) {
				return ;
			}
			
 		}
	}
	
	
	
	public static void main(String[] args) {
	
		TreeNode<Integer> root = takeInputLevelWise() ;
		PrintLevelWise(root);

	}

}
