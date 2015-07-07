package tony.exe.java;

public class Something {
//public int addOne(final int x){
//	return ++x;
//}
	
	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}
	public void addOne(final Other o){
		o.i++;
	}
	
	
	
}


class Other{
	public int i;
}