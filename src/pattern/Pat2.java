package pattern;
/*
 * 1 1 1 1 1
 * 1 1 1 2 2
 * 1 1 3 3 3
 * 1 4 4 4 4
 * 5 5 5 5 5
 */
public class Pat2 {
public static void main(String[] args) {
	int row=6;
    int num=1;
	for(int i=row;i>0;i--) {
		for(int j=1;j<i;j++) {
			System.out.print(1+" ");
		}
		for(int k=1;k<=num;k++) {
			System.out.print(num+" ");
		}
		num++;
		System.out.println();
		
	}
}
}
