
public class Ineuron {

	public static void main(String[] args) {
		
		int i,j;
		int n=10;
		for(i=0;i<n;i++){
			
			for(j=0;j<n;j++) {
				if((i==0 || i==(n-1)) || j== (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if(j==0 || j==(n-1) || (i==j)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if(i==0 || i==(n-1) || j==0 || ((i==((n-1)/2) && (j<((n)/2))))) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if(j==0 || j==(n-1) || i==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if((i==0 )|| j==0 || (j==(n-1)&&(i<n/2) || i==(n-1)/2) || (i-j)==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(j=0;j<10;j++) {
				if(j==0 || j==(n-1) || (i==j)) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
		

	


