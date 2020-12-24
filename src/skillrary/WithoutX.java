package skillrary;
/*
 * Given a string, if the first or last chars are 'x', 
 * return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
public class WithoutX {
	public static void main(String[] args) {
		System.out.println(withoutX("xHix"));
	}
	public static String withoutX(String word) {
		if(word.startsWith("x") && word.endsWith("x")) {
			return word.substring(1, word.length()-1);
		}
		else if(word.startsWith("x")) {
			return word.substring(1);
		}
		else if(word.endsWith("x")) {
			return word.substring(0, word.length()-1);
		}
		else 
		{
			return "";
		}
	}

}
