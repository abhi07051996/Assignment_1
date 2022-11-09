package Assignment_2;
//WAP to sort an array using Quick Sort Algorithm. 

public class Second_Program {

	public static void main(String[] args) {
		
		int[] a = {15,9,7,13,12,16,5,18,11};
		
		int l = a.length;
		Second_Program s = new Second_Program();
		s.quickSort(a, 0, l-1);
		
		for(int elem : a) {
			System.out.print(elem + " ");
		}
		
	}
	
	int partition(int[] a,int low, int high) {
		int pivot = a[(low+high)/2];
		
		while(low<=high) {
			
			while(a[low]<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;		
			}
			
			if(low<=high) {
				int temp = a[low];
				a[low]=a[high];
				a[high]=temp;
			
			low++;
			high--;
			
			}
		}
	
	return low;
	}
	
	void quickSort(int[]arr,int low,int high) {
		int x = partition(arr,low,high);
		if(low<x-1) {
			quickSort(arr,low,x-1);
		}
		if(x<high) {
			quickSort(arr,x,high);
		}
	}
	
	

}
