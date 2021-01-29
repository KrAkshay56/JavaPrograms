package pattern;
/*
 * 1 0 0 0 0
 * 0 2 0 0 0
 * 0 0 3 0 0
 * 0 0 0 4 0
 * 0 0 0 0 5
 */
public class Pat1 {
public static void main(String[] args) {
	int row=5;
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=row;j++) {
			if(i==j) {
				System.out.print(i+" ");
			}
			else
			{
				System.out.print(0+" ");
			}
		}
		System.out.println();
	}
}
}
