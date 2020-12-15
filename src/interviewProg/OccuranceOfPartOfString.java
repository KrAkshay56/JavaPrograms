package interviewProg;

public class OccuranceOfPartOfString {
	public static void main(String[] args) {
		String[] string= {"HAPPY","NAPPY","DAPPY","APPLY"};
		int count=0;
		for(int i=0;i<string.length;i++) {
			String word = string[i];
			if(word.contains("APPY")) {
				count++;
			}
		}
          System.out.println(count);
	}

}
