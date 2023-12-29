package Student_Challenge;
import java.util.Scanner;
public class PrimeNumber {
	static boolean isPrime(int x) {
		for(int i=2;i<x;i++) {
			if(x%i==0)
				return false;	
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to check if it is a prime number or not: ");
		int n= sc.nextInt();
		System.out.println(isPrime(n));
	}

}