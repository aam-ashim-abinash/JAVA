package Practice_Methods;
public class method8 {
	static void show(int...x) {
		for(int y:x) {
			System.out.println(y);
		}
	} 	
public static void main(String[] args) {
	show();
	show(10,20,30);
	show(new int[]{3,5,6,7});
}
}
