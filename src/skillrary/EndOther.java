package skillrary;
/*
 * Given two strings, return true if either of the strings appears at the very 
 * end of the other string, ignoring upper/lower case differences 
 * (in other words, the computation should not be "case sensitive"). 
 * Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
public class EndOther {
	public static void main(String[] args) {
		System.out.println(endOther("abc", "abXaB"));
	}
	public static boolean endOther(String text1,String text2) {
		text1=text1.toLowerCase();
		text2=text2.toLowerCase();
		if(text1.endsWith(text2) || text2.endsWith(text1)) {
			return true;
		}
		else 
		{
			return false;
		}
	}

}
