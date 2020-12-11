package day3_ArrayPrograms;

public class CopyOneArrayToAnother {
	public static void main(String[] args) {
		char[] ch= {'A','b','C','d','E','f'};
		char[] newCh=new char[ch.length];
		int num=0;
		for(int i=ch.length-1;i>=0;i--) {
			newCh[num]=ch[i];
			num++;
		}
		System.out.println("print new Array elements");
		for(int i=0;i<newCh.length;i++) {
			System.out.println(newCh[i]);
		}
	}

}
