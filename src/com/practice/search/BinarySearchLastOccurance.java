package com.practice.search;

import java.util.Scanner;

public class BinarySearchLastOccurance {
	public static void main(String[] args){
		int[] array = {4,5,6,7,7,7,7,8,9};
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter number of elements: ");
		int no_of_elements = sc.nextInt();
		System.out.print("Enter elements: ");
		for (int i=0 ; i<no_of_elements ; i++){
			array[i] = sc.nextInt();
		}*/
		System.out.print("Enter element to search: ");
		int value = sc.nextInt();
		int result = getLastOccurrence(array,value);
		System.out.println(result);
		sc.close();
	}
	public static int getLastOccurrence(int[] array, int value){
		int first, last, mid, result;
		first = 0;
		last = array.length - 1;
		result = -1;
		while(first<=last){
			mid = (first+last)/2;
			if(array[mid] == value){
				result = mid;
				first = mid + 1;
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
		return result;
	}
}
