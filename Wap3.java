
public class Wap3 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=13;i++) {
			for(j=1;j<=7;j++) {
				if(j<=(7-i) || ((i>=6) && (j<=(i-5)))) {
				System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
