package Linked_List2_Lecture_09;

import java.util.Scanner;

/*
In this Merge Sort code 
we APPLY most of the function or code like
1 - MID_NODE(mid point of node ).
2 - MERGING_TWO_SORTED_LINKED_LIST
3 - TAKE_INPUT
4 - PRINT
5 - MERGE SORT (sort the Linked List by divide and conquer
                 technique is called MergeSort) .
 */

public class MERGE_SORT {

	public static Node<Integer>takeInput(){
		 Node<Integer>head = null , tail = null ;
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
	
	public static Node<Integer>MidInNode (Node<Integer>head){
		if ( head == null || head.next == null) {
			return head ;
		}
		Node<Integer>Slow = head ;
		Node<Integer>Fast = head ;
		
		while (Fast.next != null && Fast.next.next != null) {
			Slow = Slow.next ;
			Fast = Fast.next.next ;
		}
		return Slow ;
	}
	
	public static Node<Integer>MergeTwoSortedList (Node<Integer>head1 , Node<Integer>head2){
		
		if ( head1 == null) {
			return head2 ;
		}
		if ( head2 == null) {
			return head1 ;
		}
		
		Node<Integer>temp1 = head1 ,temp2 = head2 ;
		Node<Integer>head = null , tail = null ;
		
		if ( temp1.data <= temp2.data) {
			head = temp1 ;
			tail = temp1 ;
			temp1 = temp1.next ;
		}
		else {
			head = temp2 ;
			tail = temp2 ;
			temp2 = temp2.next ;
		}
		while ( temp1 != null && temp2 != null) {
			if ( temp1.data <= temp2.data) {
				tail.next = temp1 ;
				tail = temp1 ;
				temp1 = temp1.next ;
			}
			else {
				tail.next = temp2 ;
				tail = temp2 ;
				temp2 = temp2.next ;
			}
		}
		if ( temp1 != null) {
			tail.next = temp1 ;
		}
		else {
			tail.next = temp2 ;
		}
		return head ;
	}
	
	public static Node<Integer>MergeSort(Node<Integer>head){
		if ( head == null || head.next == null) {
			return head ;
		}
		Node<Integer>MidPoint = MidInNode(head) ;
		Node<Integer>head1 = head ;
		Node<Integer>head2 = null ;
		head2 = MidPoint.next ;
		MidPoint.next = null ;
		Node<Integer>newHead1 = MergeSort(head1) ;
		Node<Integer>newHead2 = MergeSort(head2) ;
		Node<Integer>HEAD = MergeTwoSortedList(newHead1, newHead2) ;
		return HEAD ;
	}
	public static void print( Node<Integer>head) {
		while ( head != null) {
			System.out.print(head.data + " ");
			head = head.next ;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		Node<Integer>head = takeInput() ;
		Node<Integer>SortedHead = MergeSort(head) ;
		print(SortedHead); 
	}

}
