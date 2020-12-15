package interviewProg;

public class Brick {
	public static boolean makeBricks(int small, int big, int goal) {
	    if (goal > small + big * 5)
	        return false;
	    else if (goal%5>small) 
	        return false;
	    else
	        return true;
	}
	public static void main(String[] args) {
		System.out.println(makeBricks(4, 4, 20));
	}

}
