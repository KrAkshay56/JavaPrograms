package arrayProgram;

public class ArmStrongNumber {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			if(isArmStrong(i)) {
				System.out.println(i);//1^3+5^3+3^3
			}
		}
	}
	public static boolean isArmStrong(int num) {

		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=Math.pow(rem, 3);
			num=num/10;
		}
		if(temp==sum) {
			return true;
		}
		else
		{
			return false;
		}

	}

}
