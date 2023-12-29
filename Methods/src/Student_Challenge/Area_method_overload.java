package Student_Challenge;
import java.util.Scanner;
public class Area_method_overload {
	static double area(double x, double y) {
		return x*y;
	}
	static double area(double x) {
		return Math.PI*x*x;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of a rectangle");
		double l= sc.nextDouble();
		System.out.println("Enter breadth of a rectangle");
		double b= sc.nextDouble();
		System.out.println("Enter radius of a circle");
		double r= sc.nextDouble();
		System.out.println("The area of rectangle "+area(l,b));
		System.out.println("The area of circle "+area(r));
	}
}