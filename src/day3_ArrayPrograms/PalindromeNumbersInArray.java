package day3_ArrayPrograms;

public class PalindromeNumbersInArray {
	
	public static int palindrome(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int	arr[]={232,12,78,898,34543,45};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==palindrome(arr[i])) {
				System.out.println("Palindrome number "+arr[i]);
			}
		}
	}

}
