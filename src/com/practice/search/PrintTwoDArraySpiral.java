package com.practice.search;

public class PrintTwoDArraySpiral {
	public static void main(String[] args){
		//int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,}};
		int row = array.length - 1; 
		int col = array[0].length - 1;
		
		int left=0, right=col, top=0, down=row;
		while(top<=down && left<=right){
			//Right(print ith row towards right)
			for(int i=left; i<=right ; i++){
				System.out.print(array[top][i]+ ", ");
			}
			top++;
			
			//down (print jth col)
			for(int i=top; i<=down ; i++){
				System.out.print(array[i][right]+ ", ");
			}
			right--;
			
			//left(print ith row towards left)
			for(int i=right; i>=left ; i--){
				System.out.print(array[down][i]+ ", ");
			}
			down--;
			
			//up
			for(int i=down; i>=top ; i--){
				System.out.print(array[i][left]+ ", ");
			}
			left++;
		}
	}
}
