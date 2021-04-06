package interview;

import java.util.Arrays;

public class AdditionOFTwoArray {

	public static void main(String[] args) {
		//declaring a array
		int[] a= {1,2,3};
		//declaring b array
		int[] b= {1,2,3,4,5};
		//printing the sum of both array 
		System.out.println(Arrays.toString(total(a, b)));

	}
	//Generic method for adding two array and named as a and b
	public static int[] total(int[] a,int[] b) {
		//initializing one sum array with null
		int[] sum=null;
		// if both array length are same we need to declare sum length of array a or b 
		if(a.length==b.length) {
			sum=new int[a.length];
			for(int i=0;i<a.length;i++) {
				//add both elements of array a and b 
				sum[i]=a[i]+b[i];
			}
		}
		//if array a length more than b
		else if(a.length>b.length) {
			//declare sum array with length similar to length a
			sum=new int[a.length];
			for(int i=0;i<a.length;i++) {
				// if array b is length in length to compared with i
				if(b.length>i) {
					//add both array a and b elements
					sum[i]=a[i]+b[i];
				}
				else
				{
					//else add only elements of a
					sum[i]=a[i];
				}
			}
		}
		// if array b length is more than array length a
		else if(a.length<b.length){
			//initialize the sum length equal to array b length
			sum=new int[b.length];
			for(int i=0;i<b.length;i++) {
				//if a length is more than i
				if(a.length>i) {
					//add both array a and b and store it in sum array
					sum[i]=a[i]+b[i];
				}
				else
				{
					//else add only array b elements
					sum[i]=b[i];
				}
			}
		}
		//returning the sum
		return sum;
	}

}
