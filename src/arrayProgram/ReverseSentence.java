package arrayProgram;

public class ReverseSentence {
	public static void main(String[] args) {
		System.out.println(reverse("my name is Nithesh"));//hsehtiN si eman ym
	}
	
	public static String reverse(String str) {
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			newStr+=str.charAt(i);
		}
		String finalStr="";
		int start=0,end=0;
		
		for(int i=0;i<newStr.length();i++) {
			if(newStr.charAt(i)==' ') {
				end=i;
				for(int j=end-1;j>=start;j--) {
					finalStr+=newStr.charAt(j);
				}
				finalStr+=" ";
				start=i+1;
			}
		}
		for(int i=newStr.length()-1;i>=start;i--) {
			finalStr+=newStr.charAt(i);
		}
		return finalStr;
	}

}
