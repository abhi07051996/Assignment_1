package Assignment_2;
//WAP to sort an array using Bubble Sort Algorithm.
public class Third_Program {

	public static void main(String[] args) {
		
		int [] a= {1,5,8,2,5,6,9,3,88,64,33,31,36,31,99,102,77,0,-1,-18};
		int l = a.length;
		
		for(int i=0;i<l;i++) {
			
			for(int j=0;j<l-1;j++) {
				
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.print("The sorted array is:" + "[");
		for(int e:a) {
			
			System.out.print(e +" ");
		}
		System.out.println("]");
	}

}
