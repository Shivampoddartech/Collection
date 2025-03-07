package Collection;

public class Demo1 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("-------------------");
		
		for (int i : a) {
			System.out.println(i);
		}

	}
}
