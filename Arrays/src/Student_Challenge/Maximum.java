package Student_Challenge;
import java.util.Scanner;
public class Maximum {
	public static void main(String[] args) {
		int A[];
		A= new int [10];
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 10 numbers to be inputted: ");
	for (int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	int m=A[0];
	for(int i=0;i<A.length;i++) {
		if(A[i]>m)
			m=A[i];
	}
	System.out.println("Maximum of the array is "+m);
	}
}
