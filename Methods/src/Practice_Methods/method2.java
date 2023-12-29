package Practice_Methods;

public class method2 {
	int max(int x, int y) {
		if(x>y)
			return x;
		else
			return y;
	}
	public static void main(String[] args) {
		int a=10,b=5,c;
		method2 mp= new method2();
		c=mp.max(a,b);
		System.out.println("Maximum is "+c);
	}
}