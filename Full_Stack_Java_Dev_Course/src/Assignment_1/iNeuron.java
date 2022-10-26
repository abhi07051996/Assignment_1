package Assignment_1;

public class iNeuron {
public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<n;i++) {
			
	//////////Letter I
			
					for(int j=0;j<n;j++) {
						if((j==(3*n)/8) && i>=(n-1)/2
						||i==((n)/8) && j==(3*n)/8)
						{System.out.print("*");}
						else {System.out.print(" ");
						}
						}
					
			//////////Letter N
					
						for(int j=0;j<n;j++) {
							if((j==0)
							||(j==i)
							||(j==(n-1)	)){System.out.print("*");							}
							else {
								System.out.print(" ");
							}		
							}
						//////Space
						
						for(int j=0;j<n/4;j++) {
							
							System.out.print(" ");}		
						
					/////Letter E
						
						for(int j=0;j<n;j++) {
								if((j==0 && i>0)
								||(i==0&&j<=(3*n)/4)
								||(i==(n-1)/2) && j<=(3*n)/4			
								||	i==(n-1)&&j<=(3*n)/4){
									System.out.print("*");
										}
										else {
											System.out.print(" ");
										}		
										}
									
								/////Letter U
									
									for(int j=0;j<n;j++) {
										if((j==0 && i!=(n-1))
										||j==3*n/4		&& i!=(n-1)
										||	i==(n-1)&&j<(3*n)/4 && j!=0	
												){
											
										System.out.print("*");
										}
										else {
											System.out.print(" ");
										}		
										}
									
								/////Letter R
									
									for(int j=0;j<n;j++) {
										if((j==0 && i>0)
										||(i==0&&j<(3*n)/4&&j>0)
										||(j==(3*n)/4) && i>0 && i<(n-1)/2
										||(i==(n-1)/2) && j<(3*n)/4
										||(i-j) == (n)/3
												
												){
											
										System.out.print("*");
										}
										else {
											System.out.print(" ");
										}			
										
										}
									
									/////Letter O
									
									for(int j=0;j<n;j++) {
										if((j==0 && i!=(n-1) &&i!=0)
										||j==3*n/4		&& i!=(n-1) &&i!=0
										||	i==(n-1)&&j<(3*n)/4 && j!=0	
										|| i==0&&j<(3*n)/4 && j!=0	
												){
											
										System.out.print("*");
										}
										else {
											System.out.print(" ");
										}		
										}
									
							//////////Letter N
									
									for(int j=0;j<n;j++) {
										if((j==0)
										||(j==i)
										||(j==(n-1)	)
										
												){
											
										System.out.print("*");
										}
										else {
											System.out.print(" ");
										}		
										}
							
		System.out.println();	
				
											
			}
		
}
		
}
