package tony.exe.java;

import tony.exe.java.*;

public class TestToString {
	public static void main(String [] args) {
		Circle c1 = new Circle(2.4);
		Circle c2 = new Circle(2.4);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.toString());
	}
}
