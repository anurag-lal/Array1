package com.array;

import java.util.Scanner;

public class ArrayProgram2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size :" );
		int size = sc.nextInt();
		
		int [][]arr = new int[size][size];
		
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				System.out.println("Elements are: ");
				
				arr[i][j] = sc.nextInt();
				
				System.out.println();
			}
		}
		//System.out.println(arr);
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
