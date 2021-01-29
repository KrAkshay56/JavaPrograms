package interview;
/*
 * Given a string and a non-empty word string,
 *  return a string made of each char just before and just after every appearance
 *   of the word in the string. Ignore cases where there is no char 
 *   before or after the word, and a char may be included twice 
 *   if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */
public class EndWords {
	public static void main(String[] args) {
		System.out.println(wordEnds("abc1xyz1", "1"));
		System.out.println(wordEnds("XY123XY", "XY"));
		System.out.println(wordEnds("XY1XY", "XY"));
		System.out.println(wordEnds("abc1xyz1abc", "b"));
		System.out.println(wordEnds("abc1abc1abc", "abc") );
		
	}
	public static String wordEnds(String str, String word) {
		  String s1 = "";
		  if(str.equals(word))
		  return s1;
		  for(int i=0; i<=str.length()-word.length(); i++) {
		    if(str.substring(i,i+word.length()).equals(word)) {
		      if(i==0)
		      s1 = s1+str.charAt(i+word.length());
		      else if(i==str.length()-word.length())
		      s1= s1+str.charAt(i-1);
		      else
		      s1=s1+str.charAt(i-1) + str.charAt(i+word.length());
		    }
		  }
		  return s1;
		}
}
