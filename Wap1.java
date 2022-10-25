
public class Wap1 {

	public static void main(String[] args) {
	
		int i,j;
		for(i=1;i<=13;i++) {
			for(j=1;j<=13;j++) {
				if((j<=(8-i)) || (j>=(6+i))|| (j==1) || (j==13) || (i==13)) {
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



/*
*******
******
*****
****
***
**
*
*/