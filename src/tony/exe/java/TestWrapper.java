package tony.exe.java;

import org.junit.Test;

public class TestWrapper {
	
	
	@Test
	public void test1(){
		int i = 10;
		boolean b = false;
		Integer i1 = new Integer(i);
		System.out.println(i1.toString());
	
		Float float1 = new Float("12.3F");
		System.out.println(float1);
	}
	
	@Test
	public void test2(){
		int i1 = 10;
		String str1 = i1 +"";
		Integer i2 = i1;
		String str2 = String.valueOf(i2);
		
	}
	
}
