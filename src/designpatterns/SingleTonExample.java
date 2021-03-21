package designpatterns;

public class SingleTonExample {
	public static void main(String[] args) {
		SingleTonSynchronize ref1 = SingleTonSynchronize.getInstance();
		System.out.println(ref1);
		SingleTonSynchronize ref2 = SingleTonSynchronize.getInstance();
		System.out.println(ref2);
	}
}

class SingleTon
{
	private SingleTon() {}
	private static SingleTon ref=new SingleTon();

	public static SingleTon getInstance() {
		return ref;
	}
}

class SingleTonLazyInitialization{
	private static SingleTonLazyInitialization ref;

	public static SingleTonLazyInitialization getInstance() {
		if(ref==null) {
			ref=new SingleTonLazyInitialization();
		}
		return ref;
	}
}

class SingleTonSynchronized
{
	private SingleTonSynchronized() {}
	private static SingleTonSynchronized instance;
	
	public static synchronized SingleTonSynchronized getInstance() {
		if(instance==null) {
			instance=new SingleTonSynchronized();
		}
		return instance;
	}
	
}

class SingleTonSynchronize{
	private static SingleTonSynchronize instance;
	private SingleTonSynchronize() {}
	
	public static SingleTonSynchronize getInstance() {
		if(instance==null) {
			synchronized (SingleTonSynchronize.class) {
				instance=new SingleTonSynchronize();
			}
		}
		return instance;
	}
	
}
