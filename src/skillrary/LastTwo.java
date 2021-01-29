package skillrary;
/*
 * Given a string of any length, return a new string where the last 2 chars,
 *  if present, are swapped, so "coding" yields "codign".

Testcase1:
input: lastTwo("coding") output: "codign"
Testcase2:
input: lastTwo("cat") output: "cta"
Testcase3:
input: lastTwo("ab") output: "ba"
 */
public class LastTwo {
	public static void main(String[] args) {
		System.out.println(lastTwo("coding"));
		System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ba"));
		System.out.println(lastTwo("b"));
	}
	public static String lastTwo(String text) {
		String str="";
		if(text.length()<=1) {
			return text;
		}
		else {
		for(int i=0;i<text.length()-2;i++) {
			str+=text.charAt(i);
		}
		return str+text.charAt(text.length()-1)+text.charAt(text.length()-2);
		}
	}

}
