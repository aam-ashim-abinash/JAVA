package Student_Challenge;
public class MaxArray {
	static int max(int A[]) {
		if (A.length == 0)
            return Integer.MIN_VALUE;
        int m = A[0];
        for (int i = 1; i < A.length; i++)
            if (A[i] > m)
                m = A[i];
        return m;
	}
	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		System.out.println("The maximum number is "+max(A));
	}
}
