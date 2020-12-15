package interviewProg;

import java.util.Scanner;

public class PrintPrime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(i+j==num && isPrime(i) && isPrime(j)) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
		scan.close();
	}

	public static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
