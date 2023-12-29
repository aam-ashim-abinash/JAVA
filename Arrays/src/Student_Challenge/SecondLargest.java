package Student_Challenge;
import java.util.Scanner;
public class SecondLargest {
	public static void main(String[] args) {
		int A[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Input values for array");
		for (int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		int m=A[0],n=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>m)
				n=m;
				m=A[i];
		}
			System.out.println("2nd Largest of the array is "+n);
	}
}
