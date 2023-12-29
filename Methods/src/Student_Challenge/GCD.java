package Student_Challenge;
import java.util.Scanner;
public class GCD {
	static int Gcd(int a, int b) {
		int x= Math.max(a, b),  y=Math.min(a, b), m=0;
		while(x%y!=0) {
			 y= x%y;
			 m=y;
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2=sc.nextInt();
		System.out.println("The GCD of two numbers is: "+Gcd(n1,n2));
	}
}
