package Day3;

public class Test5 {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o);
		change(o);
		System.out.println(o);
	}

	public static void change(Object o) {
		//o = null;
		o.getClass();
	}
}
