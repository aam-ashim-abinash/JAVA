package Student_Challenge;
import java.util.Scanner;
public class SumOfAllNumbers {
	static int sum(int ...x) {
		int sum=0;
		for(int i=1;i<=x.length;i++)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of elements: ");
	        int count = sc.nextInt();
	        int[] numbers = new int[count];
	        System.out.println("Enter the numbers: ");
	        for (int i = 0; i < count; i++) {
	            numbers[i] = sc.nextInt();
	        }
	        System.out.println("The sum of these numbers is " + sum(numbers));
	}
}
