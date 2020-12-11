package stringPrograms;

public class SmallestWordInString {
	
	public static void main(String[] args) {
		String str="Grass is greener than other side";
		String[] string=str.split(" ");
		int min=string[0].length();
		String minWord=string[0];
		for(int i=0;i<string.length;i++) {
			if(min>string[i].length()) {
				min=string[i].length();
				minWord=string[i];
			}
		}
		System.out.println(minWord);
	}

}
