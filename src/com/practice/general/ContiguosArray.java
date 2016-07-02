package com.practice.general;

public class ContiguosArray {
	public static void main(String[] args){
		int[] array = {98,96,99,97,95};
		System.out.println(isArrayContiguos(array));
	}
	
	static boolean isArrayContiguos(int[] array){
		//int max = getMaxValue(array);
		int min = getMinValue(array);
		int len = array.length;
		for(int i=0 ; i<len ; i++){
			array[i] = array[i]-min;
		}

		//to check wheter array is not going out of bounds in next for loop
		for(int i=0 ; i<len ; i++){
			if(array[i] > len){
				return false;
			}
		}

		for(int i=0 ; i<len ; i++){
			array[Math.abs(array[i])] *= (-1);
		}
		
		for(int i=0 ; i<len ; i++){
			if(array[i]>0){
				return false;
			}
		}
		return true;
	}
	
	static int getMaxValue(int[] array){
		int max=Integer.MIN_VALUE;
		int len=array.length;
		for(int i=0 ; i<len ; i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;
	}
	static int getMinValue(int[] array){
		int min=Integer.MAX_VALUE;
		int len=array.length;
		for(int i=0 ; i<len ; i++){
			if(array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
}
