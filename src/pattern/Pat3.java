package pattern;
/*
 *     1
 *    1 2
 *   1 2 3
 *  1 2 3 4
 * 1 2 3 4 5
 *  1 2 3 4
 *   1 2 3
 *    1 2
 *     1
 */
public class Pat3 {
	public static void main(String[] args) {
		int star=1;
		int space = 4;
		int row=9;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(k+" ");
			}
			if(row<5) {
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			System.out.println();
		}
	}

}
