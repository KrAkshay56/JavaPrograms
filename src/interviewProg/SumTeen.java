package interviewProg;

import java.util.Scanner;

public class SumTeen {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=scan.nextInt();
		System.out.println("Enter b:");
		int b=scan.nextInt();
		System.out.println("Enter c:");
		int c=scan.nextInt();
		System.out.println(sumThree(a, b, c));
		scan.close();
	}

	public static int sumThree(int a, int b,int c) {
		int sum=0;
		int[] arr= {13,14,17,18,19};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				a=0;
			} if(arr[i]==b) {
				b=0;
			} if(arr[i]==c) {
				c=0;
			}
		}
		sum=sum+a+b+c;
		return sum;
	}
}
