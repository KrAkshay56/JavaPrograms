package interview;

public class ContainsTest {
	public static void main(String[] args) {
		String[] str= {"TestManager","TestEngineer","E2Open","Testmaterial"};
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].contains("Test") || str[i].contains("test")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
