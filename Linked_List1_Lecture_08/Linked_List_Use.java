// TAKING LINKED LIST INPUTS AND PRINT THEM .AND PRINT ITH NODE ..

package Linked_List1_Lecture_08;
import java.util.Scanner;

public class Linked_List_Use {
	public static Node <Integer> takeInput(){
		Node<Integer>head = null ;
		Node<Integer>tail = null ;
		Scanner s = new Scanner(System.in) ;
		int data = s.nextInt() ;
		while ( data != -1) {
			Node<Integer>newNode = new Node<Integer>(data) ;
			if ( head == null) {
				head = newNode ;
				tail = newNode ;
				
			}
			else {
				tail.next = newNode ;
				tail = tail.next ;
			}
			data = s.nextInt() ;
			
		}
		return head ;
		
	}
	public static void print(Node<Integer>head) {
		while ( head != null) {
			System.out.print(head.data + " ");
			head = head.next ;
		}
		System.out.println();
	}
	public static void printIthNode(Node<Integer>head , int i) {
		int count = 0 ;
		while ( head != null) {
			head = head.next ;
			count++ ;
			if ( count == i ) {
				System.out.println(head.data);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2 ;
		Node<Integer>head = takeInput() ;
		print(head);
		printIthNode(head, i); 

	}

}
