package Practice_Methods;

public class method7 {
	static int max(int x, int y){
		return x>y?x:y;
	}
	static float max(float x, float y){
		return x>y?x:y;
		}
	static int max(int x, int y, int z){
			return x>y&&x>z?x:(y>z?y:z);
		}
	public static void main(String[] args) {
		int a=10,b=5,c=1;
		float d=10.0f,e=5.0f;
		System.out.println(max(a,b));
		System.out.println(max(a,b,c));
		System.out.println(max(d,e));
		System.out.println(max(a,e));
	}
}