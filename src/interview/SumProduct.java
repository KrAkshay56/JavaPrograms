package interview;

public class SumProduct {
	public static void main(String[] args) {
		sumProd(15);
	}
	public static void sumProd(int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				if((i+j)<n && (i*j)>=n) {
					int min1 = Math.min(i, i+1);
					int min2 = Math.min(i, i+1);
					if((min1+min2)<n && (min1*min2)>=n) {
						System.out.println(min1+", "+min2);
						break;
					}
				}
			}
		}
		
		
	}


}
