package interviewProg;

public class Sample2  {
	public static void main(String[] args) {
		new Sample() {
			@Override
			public void sample() {
				System.out.println("sample abstract class");
			}
		}.sample();
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10,20,30,40,50));
	}
	
	public static int sum(int... num) {
		int sum=0;
		for(int a:num) {
			sum+=a;
		}
		return sum;
	}

}
