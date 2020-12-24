package skillrary;
/*
 * Given a string of odd length, return the string length 3 from its middle, 
 * so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
public class MiddleThree {
	public static void main(String[] args) {
		System.out.println(middleThree("and"));
	}
	public static String middleThree(String word) {
		String str="";
		if(word.length()>=3) {
			for(int i=0;i<3;i++) {
				str+=word.charAt((word.length()/2)-1+i);
			}
		}
		else
		{
			return str;
		}
		return str;
	}
	
}
