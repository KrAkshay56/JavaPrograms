package interview;

import java.util.Arrays;

public class AdditionOFTwoArray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {1,2,3,4,5};
		
		
		System.out.println(Arrays.toString(total(a, b)));

	}
	
	public static int[] total(int[] a,int[] b) {
		int[] sum=null;
		if(a.length>b.length) {
			sum=new int[a.length];
			for(int i=0;i<a.length;i++) {
				if(b.length>i) {
					sum[i]=a[i]+b[i];
				}
				else
				{
					sum[i]=a[i];
				}
			}
		}
		else if(a.length<b.length){
			sum=new int[b.length];
			for(int i=0;i<b.length;i++) {
				if(a.length>i) {
					sum[i]=a[i]+b[i];
				}
				else
				{
					sum[i]=b[i];
				}
			}
		}
		return sum;
	}

}
