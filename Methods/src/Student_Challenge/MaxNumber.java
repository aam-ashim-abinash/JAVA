package Student_Challenge;
import java.util.Scanner;
public class MaxNumber {
    static int max(int... x) {
        if (x.length == 0)
            return Integer.MIN_VALUE;
        int m = x[0];
        for (int i = 1; i < x.length; i++)
            if (x[i] > m)
                m = x[i];
        return m;
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
        
        System.out.println("The maximum of these numbers is " + max(numbers));
    }
}
