package numbers.JavaMegaProjectList.codeInnovator;

import java.util.Arrays;

public class Sorting {
//Sorting - Implement two types of sorting algorithms:
//	Merge sort and bubble sort

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hello = {11, 5, 2, 10, 7, 3, 4, 1, 9, 6, 13, 8, 12};
		printArray(hello);
		printArray(mergeSort(hello));
		
		
		
	}
	public static int[] mergeSort(int[] input){     
		
		if( input.length == 1){
			return input;
		}

		// 1.divide the array into two: left & right.
		int inputLength = input.length;
		int midpoint = inputLength /2;
		int[] left = new int[midpoint];
		int[] right;
		if( inputLength%2 == 0){
			right = new int[midpoint];
			
			
		} else {
			right = new int[midpoint + 1];
		}
		
		for(int i= 0; i<midpoint; i++){
			left[i] = input[i];
		}
		
		int temp = 0;
		for(int j= midpoint; j<input.length; j++){
			right[temp] = input[j];
			temp++;
		}
		// 2. divide it recursively. 
		left =  mergeSort(left);
		right = mergeSort(right);
		
		int[] result = merge(left, right);
		return result;
	}
	
	private static int[] merge(int[] left, int[] right) {
		// 3. merge it together. 
	 int leftIndex = 0;
	 int rightIndex = 0;
	 int totalLength = left.length + right.length;
	 int[] result = new int[totalLength];
	 for(int i = 0; i<totalLength; i++){
		 if(leftIndex < left.length && rightIndex < right.length){	 
		 if(left[leftIndex] < right[rightIndex]){
			 result[i] = left[leftIndex];
			 leftIndex++;
		 } else {
			 result[i] = right[rightIndex];
			 rightIndex++;
		 }
	 } else if(leftIndex <left.length){
		 result[i] = left[leftIndex];
		 leftIndex++;
	 } else if (rightIndex < right.length){
		 result[i] = right[rightIndex];
		 rightIndex++;
	 }
		 
	 }
	 return result;
	 
	}

	public static void printArray(int[] array){
		System.out.println(Arrays.toString(array));
		
	}
	
	
		
	
}
