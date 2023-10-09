package Lecture_12_ARRAYS_2D;

import java.util.Scanner;

public class Print_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		System.out.println("enter the size of the row ");
		int row = s.nextInt() ;
		System.out.println("enter the size of the columns ");
		int col = s.nextInt() ;
		int arr2d [][] = new int[row][col] ;
		for (int i = 0 ; i < arr2d.length ; i++) { // if we don't know the size
//	    for (int i = 0 ; i < row ; i++) {
			for (int j = 0 ; j < arr2d[i].length ; j++) { // if we don't know the size
//				for (int j = 0 ; j < col ; j++) {  if we know the size of col.
				System.out.println("enter value for" +"("+ i + " , " + j +")"+ "index");
				arr2d [i][j] = s.nextInt() ;
				
			}
		}
		int sum = 0 ;
		for (int i = 0 ; i < row ; i++) {
			for (int j = 0 ; j < col ; j++) {
				System.out.print(arr2d[i][j] + " ") ;
				sum = sum + arr2d[i][j] ;
				
			}
			System.out.println() ;
			System.out.println(sum) ;
			sum = 0 ;
		}

	}

}
