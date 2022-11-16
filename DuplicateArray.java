package me.personal.assignment;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {

// ------------------------------USER INPUT-------------------------------
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the SIZE of the Array");
		int size = scan.nextInt();

		int[] arr = new int[size];
		int n = arr.length;
		int temp = 0;
		int count = 0;

		System.out.println("Enter the elements of the Array");
		for (int x = 0; x < n; x++) {
			arr[x] = scan.nextInt();

		}
		System.out.println("The Array is : ");
		for (int x = 0; x < n; x++) {
			System.out.print(arr[x] + " ");

		}
		System.out.println();
// ------------------------SEARCHING FOR DUPLICATES-----------------------------

		for (int i = 0; i < n ; i++) {
			 temp = arr[i];
			 for(int j = i+1; j < n ; j++) {
				 //System.out.println("j ----> "+j);
				 if(temp == arr[j]) {
					 count++;
					 //System.out.println("total "+count);
				 }
			 }

		}

		System.out.println();
		if (count > 0) {
			System.out.println("Duplicate elements found");
		} else {
			System.out.println("No duplicate elements found");
		}

	}

}
