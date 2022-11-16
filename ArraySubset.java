package me.personal.assignment;

import java.util.Scanner;

public class ArraySubset {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//------------------------------USER INPUT-------------------------------	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the SIZE of the Array");
		int size = scan.nextInt();
		
		if(size>10) {
			System.out.println("Array size should be below 10. Please re-enter the SIZE of the Subset Array");
			size = scan.nextInt();
		}

		int[] arr = new int[size];
		int n = arr.length;
		int count=0;
		
		System.out.println("Enter the elements of the Array");
		for (int x = 0; x < n; x++) {
			arr[x] = scan.nextInt();

		}
		System.out.println("The Array is : ");
		for (int x = 0; x < n; x++) {
			System.out.print(arr[x] + " ");

		}
//------------------------MATCHING THE ELEMENTS OF ARRAY-----------------------------
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < n; j++) {
				if(a[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println();
		if(count == size) {
			System.out.println("The array is a Subset of Single-digit numbers");
		}
		else {
			System.out.println("The array is not a Subset of Single-digit numbers");
		}

	}

}
