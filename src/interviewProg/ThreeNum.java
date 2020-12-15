package interviewProg;

public class ThreeNum {
	public static int threeSum(int a,int b,int c) {
		int sum=0;
		if(a==13) {
			return sum;
		}
		else if(b==13) {
			return sum=sum+a;
		}
		else if(c==13){
			return sum =sum+a+b;
		}
		else
		{
			sum=sum+a+b+c;
			return sum;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(threeSum(1, 2, 3));
		System.out.println(threeSum(1, 2, 13));
		System.out.println(threeSum(1, 13, 3));
		System.out.println(threeSum(13, 2, 3));
		System.out.println(threeSum(13, 1, 1));
	}

}
