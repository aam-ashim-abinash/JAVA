package Student_Challenge;
import java.util.Scanner;
public class Validation {
	static boolean valid(int A) {
		return A>3 && A<10;
	}
	static boolean valid(String s) {
		return s.matches("[a-zA-z\\s]+");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name of a kid");
		String name= sc.nextLine();
		System.out.println("Is the name valid "+valid(name));
		System.out.println("Enter the age to be fit in the kindergarden");
		int age= sc.nextInt();
		System.out.println("Is the age valid to admit in a kindergarden "+valid(age));
	}
}
