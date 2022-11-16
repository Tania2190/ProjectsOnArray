package me.personal.assignment;

import java.util.Scanner;

public class QuickSort_Array {

	public static void main(String[] args) {

//		 int[] arr = { 23,76,11,74,18,39,11,99,65 };

//------------------------------USER INPUT OF ARRAY-------------------------------------		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the SIZE of the array");
		int size = scan.nextInt();

		int[] arr = new int[size];
		int n = arr.length;
		int pivot = n - 1;

		System.out.println("Enter the elements of the array");
		for (int m = 0; m < n; m++) {
			arr[m] = scan.nextInt();

		}
		System.out.println("The array is");
		for (int m = 0; m < n; m++) {
			System.out.print(arr[m] + " ");
		}
		System.out.println();

//------------SORTING ARRAY-------------------------		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < pivot; j++) {

					if (arr[j] > arr[pivot]) {
//						System.out.println(i + "------------" + j);
						if (arr[j] > arr[j + 1]) {
							int temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;

						}

					}
				}
				pivot--;
//				System.out.println("outside j loop. i= " + i);

			}
			System.out.println("The sorted array is as follows : ");
			for (int elem : arr) {
				System.out.print(elem + " ");
			}

	}

}
