package interviewProg;

public class Pattern2 {
	public static void main(String[] args) {
		int row =4;
		for(int i=0;i<row;i++) {
			char ch='F';
			ch-=i;
			for(int j=1;j<=row;j++) {
				if(i==row-1 && j==row) {
					System.out.print(1);
				}
				else
				{
					System.out.print(ch--);
				}
			}
			System.out.println();
			
		}
	}

}
