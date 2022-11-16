package me.personal.assignment;

import java.util.Scanner;

public class SelectionSort_Array {

	public static int minElementIndex(int a[], int mrk) {
		int i=mrk;
		int value = a[i];
		int index=i;

		for (i = mrk; i < a.length - 1; i++) {
			
			if(a[i]>a[i+1]) {
				if (value > a[i+1]) {
					value = a[i+1];
					index = i+1;
				}
			}
			else {
				if(value > a[i]) {
					value = a[i];
					index = i;
				}
			}
			
		}
//		System.out.println(value+" in index "+ index +" is the smallest element in the array");
//		System.out.println();

		return index;
	}

	public static void main(String[] args) {

		// int [] arr = {7,2,8,4,9,5,1,3};

//----------------USER INPUT OF ARRAY---------------------------------		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the SIZE of the array");
		int size = scan.nextInt();

		int[] arr = new int[size];
		int n = arr.length;

		System.out.println("Enter the elements of the array");
		for (int m = 0; m < n; m++) {
			arr[m] = scan.nextInt();

		}
		System.out.println("The unsorted array is");
		for (int m = 0; m < n; m++) {
			System.out.print(arr[m] + " ");
		}
		System.out.println();
//-----------------------------------------------------------------------------

		for (int i = 0; i < arr.length; i++) {
			int minIdx = minElementIndex(arr, i);
			//System.out.println("The min value is " + arr[minIdx]);

			if (arr[minIdx] < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
		System.out.println("The sorted array is as follows : ");
		for (int elem : arr) {
			System.out.print(elem + " ");
		}

	}

}
