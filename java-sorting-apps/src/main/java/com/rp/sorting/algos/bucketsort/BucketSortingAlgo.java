/**
 * Application implementing Bucket Sort algorithm.
 */
package com.rp.sorting.algos.bucketsort;


public class BucketSortingAlgo {

	public static void main(String[] args) {

		BucketSortingAlgo application = new BucketSortingAlgo();
		
		// this array will have unsorted array
		int[] dataToSort = {2,1,6,9,2,1,7,4,11};
		
		System.out.print("Unsorted data : [ ");
		application.printArray(dataToSort);
		System.out.println(" ]");
		
		// create another array to store sorted data
		int[] sortedData = new int[dataToSort.length];
		
		
		application.sortData(dataToSort, sortedData);
		
		System.out.print("Sorted data : [ ");
		application.printArray(sortedData);
		System.out.println(" ]");
	}

	private void sortData(int[] source, int[] dest){
		
		// find the max value in source array
		// in this case the value is 11
		int maxValue = 11;
		
		// create a new byte array with max value available in source array
		short[] counter = new short[maxValue];
		
		// start making counting in counter array
		for(int i = 0; i < source.length; i++){
			short index = (short)source[i];
			short count = counter[--index];
			counter[index] = ++count;
		}
		
		//populated data in dest array
		for(int i = 0; i < counter.length; i++){
			int destCounter = 0;
			while(counter[i] > 0){
				dest[destCounter++] = counter[i];
				counter[i]--;
			}
			destCounter = 0;
		}

	}
	
	private void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
	}
}
