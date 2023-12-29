package Student_Challenge;
import java.util.Scanner;
public class Search {
	public static void main(String[] args) {
		int A[]= {10,20,30,40,50,60};
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to find in the array: ");
		int num= sc.nextInt(),m=0;
		for(int i=0;i<A.length;i++) {
			if(num==A[i]) {
				System.out.println("The number is in the "+i+" index of the array");
				m=i;
			}
		}
			if(num!=A[m])
				System.out.println("Number not found");
	}
}
