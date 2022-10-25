
public class Wap2 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=8;i++) {
			for(j=1;j<=15;j++) {
				if(j<=i || j>=(16-i)) {
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
