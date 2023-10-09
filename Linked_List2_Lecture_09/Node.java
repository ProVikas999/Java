package Linked_List2_Lecture_09;


public class Node<T> {
	T data;
	Node<T> next ;
	 Node(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		next = null ;
	}
	 void fun(Node start)
	 {
	   if(start == null)
	     return;
	   System.out.print( start.data); 

	   if(start.next != null )
	     fun(start.next.next);
	   System.out.print(start.data);
	 }

}

