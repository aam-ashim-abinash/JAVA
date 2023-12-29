package Student_Challenge;
public class Reverse {
	static int reverse(int x) {
		int r=0;
		while(x>0) {
			r= r*10+x%10;
			x=x/10;
		}
		return r;
	}
	static int[] reverse(int A[]) {
		for(int i=A.length-1;i>=0;i--) 
			System.out.println(A[i]); 
		return A;
	}
	public static void main(String[] args) {
		int P[]= {2,4,6,8,10};
		int a= 2004;
		System.out.println(reverse(a));
		reverse(P);
	}
}
