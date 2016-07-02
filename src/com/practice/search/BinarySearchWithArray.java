package com.practice.search;

import java.util.Scanner;

public class BinarySearchWithArray {
	public static void main(String[] args){
		int[] array = {4,5};
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter number of elements: ");
		int no_of_elements = sc.nextInt();
		System.out.print("Enter elements: ");
		for (int i=0 ; i<no_of_elements ; i++){
			array[i] = sc.nextInt();
		}*/
		System.out.print("Enter element to search: ");
		int value = sc.nextInt();
		search(array,value);
		sc.close();
	}
	static int search(int[] array, int value){
		int first, last, mid;
		first = 0;
		last = array.length - 1;
		
		while(first<=last){
			mid = (first+last)/2;
			if(array[mid] == value){
				System.out.print("Element found at "+ mid);
				return 1;
			}
			else{
				if(array[mid] < value){
					first = mid + 1;
				}
				else{
					last = mid - 1;
				}
			}
		}
		System.out.print("Sorry... Element not found");
		return 0;
	}
}
