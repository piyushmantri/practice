package com.practice.search;

import java.util.Scanner;

public class NumberOfOccurrencesInSortedArray {
	public static void main(String[] args){
		int[] array = {4,5,6,7,7,7,7,7,8,8,8,9};
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter number of elements: ");
		int no_of_elements = sc.nextInt();
		System.out.print("Enter elements: ");
		for (int i=0 ; i<no_of_elements ; i++){
			array[i] = sc.nextInt();
		}*/
		System.out.print("Enter element to search: ");
		int value = sc.nextInt();
		int result = getNumberOfOccurrence(array,value);
		System.out.println(result);
		sc.close();
	}
	static int getNumberOfOccurrence(int[] array, int value){
		int first = BinarySearchFirstOccurance.getFirstOccurrence(array, value);
		int last = BinarySearchLastOccurance.getLastOccurrence(array, value);
		return (first==-1 && last==-1)? 0 : last-first+1;
	}
}
