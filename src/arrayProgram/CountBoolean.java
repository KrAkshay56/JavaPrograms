package arrayProgram;

public class CountBoolean {
	public static void main(String[] args) {
		boolean[] bol=new boolean[] {true,false,true,false,false};
		System.out.println(isTrue(bol));
	}
	public static int isTrue(boolean[] bol) 
	{
		int count=0;
		for(int i=0;i<bol.length;i++) {
			if(bol[i]==true) {
				count++;
			}
		}
		return count;	
	}
}
