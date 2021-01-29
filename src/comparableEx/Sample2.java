package comparableEx;

public class Sample2 implements Sample{
	@Override
		public void m2() {
			Sample.super.m2();
		}
public static void main(String[] args) {
	Sample.m1();
	Sample2 s2=new Sample2();
	s2.m2();
	
}


}
