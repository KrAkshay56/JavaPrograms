package skillrary;
/*
 * Given a string of even length, return a string made of the middle two chars, 
 * so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
public class MiddleTwo {
	public static void main(String[] args) {
		System.out.println(middleTwo("pr"));
	}
	public static String middleTwo(String text) {
		return text.substring((text.length()/2)-1, (text.length()/2)+1);
	}

}
