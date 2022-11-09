package Assignment_2;

//WAP to find the duplicates present in an array.

import java.util.Scanner;

public class First_Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the Array : ");
	
	int[] a = new int[10];
	for(int i=0;i<a.length;i++) {		
		a[i]=sc.nextInt();
	}
	
	for(int j=0;j<a.length;j++) {
		
		for(int k=j+1;k<a.length;k++) {
			if (a[j]==a[k]) {
				System.out.print(a[k] + " ");
				
			
		}
		
		}
		
	}
	
	

	}

}
