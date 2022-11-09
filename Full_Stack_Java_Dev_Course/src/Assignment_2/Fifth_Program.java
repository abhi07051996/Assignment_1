package Assignment_2;
//WAP to sort an array using Selection Sort Algorithm.

public class Fifth_Program {

	public static void main(String[] args) {
		int [] a = {38,52,9,18,6,62,13};
		int min;
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					min = j;
				}						
			}
			temp = a[min];
			a[min]=a[i];
			a[i]=temp;			
			
		}
		for(int elem:a)
		System.out.print(elem + " ");

	}

}
