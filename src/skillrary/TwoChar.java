package skillrary;
/*
 * Given a string and an index, return a string length 2 starting at the given index. 
 * If the index is too big or too small to define a string length 2, use the first 2 chars. 
 * The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 */
public class TwoChar {
	public static void main(String[] args) {
		System.out.println(twoChar("java", 0));
		System.out.println(twoChar("java", 2));
		System.out.println(twoChar("javaa", 4));
	}
	public static String twoChar(String text,int index) {
		if(text.length()-1==index || index>=text.length() || index<=0) {
			return text.substring(0, 2);
		}
		else
		{
			return text.substring(index, index+2);
		}
	}

}
