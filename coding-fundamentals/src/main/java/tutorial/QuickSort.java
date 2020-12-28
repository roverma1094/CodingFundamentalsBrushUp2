package tutorial;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= {15,9,7,13,12,16,4,18,11};
		int arrLength=arr.length;
		QuickSort quickSort=new QuickSort();
		quickSort.quickSortRecursion(arr, 0, arrLength-1);
		quickSort.printArray(arr);
	}
	
	private int partitionElement(int[] arr,int low, int high) {
		//Middle element of pivot table
		int pivot=arr[(low+high)/2];
		while(low<high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	void quickSortRecursion(int[] arr,int low,int high) {
		int pi=partitionElement(arr, low, high);
		if(low<pi-1) {
			quickSortRecursion(arr, low, pi-1);
		}
		if(pi<high) {
			quickSortRecursion(arr, pi, high);
		}
	}
	
	void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
