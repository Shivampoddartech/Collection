package Collection;

import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		// al.add(20);
		al.add(70.20);
		al.add(45.020);
		for (double d : al) {
			System.out.println(al);
		}
	}
}
