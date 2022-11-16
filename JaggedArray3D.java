package me.personal.assignment;

import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {

		int[][][] arr = new int[2][][];
		
		arr[0] = new int [2][];
		arr[1] = new int [3][];
		
		arr[0][0] = new int [3];
		arr[0][1] = new int [4];
		
		arr[1][0] = new int [4];
		arr[1][1] = new int [2];
		arr[1][2] = new int [3];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the scores of the students below");
		
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				for(int k =0; k < arr[i][j].length; k++) {
					System.out.println("Student from college "+i+ " of class "+ j+ " of ID "+ k + " have scored : ");
					 arr[i][j][k] = scan.nextInt();
				}
			}
		}
		System.out.println("The score of all students are as follows : ");
		System.out.println();
		
		for(int i = 0; i<arr.length ; i++) {
			System.out.println("College "+i);
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print("Class "+j+"   ");
				for(int k =0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
					 
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
