package arrayProgram;

public class MatchStick {
	public static void main(String[] args) {
		System.out.println(matchStick(6));
	}
	public static int matchStick(int n) {
		return n*6-(n-1);
	}

}
