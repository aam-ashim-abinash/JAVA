package Practice_Methods;
import java.util.Scanner;
public class method4 {
	static String userName(String email){
		int a= email.indexOf('@');
		String name= email.substring(0,a);
		return name;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a mail id");
	String mail= sc.next();
	String un= userName(mail);
	System.out.println("The username of this email id is "+un);
}
}
