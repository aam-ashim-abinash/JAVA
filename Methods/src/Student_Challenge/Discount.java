package Student_Challenge;
import java.util.Scanner;
public class Discount {
	static double discount(int ...x) {
		double dis=0;
		for(double y:x) {
			if(y>1000)
				dis+=(y*0.05);
			else if(y>10000)
				dis+=(y*0.1);
		}
		return dis;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount ");
		int n= sc.nextInt();
		System.out.println("The discount given in this amount is "+discount(n));
	}
}