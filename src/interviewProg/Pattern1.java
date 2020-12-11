package interviewProg;

public class Pattern1 {
	
	public static void main(String[] args) {
		int row=3;
		int num1=row-1;
		int num2=1;
		for(int i=1;i<=row;i++) {
			char alpha='A';
			for(int j=1;j<=num1;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=num2;k++) {
				System.out.print(alpha++);
			}
			System.out.println();
			num1--;
			num2++;
		}
	}

}
