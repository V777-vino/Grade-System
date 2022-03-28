import java.util.Scanner;

public class StudentLogin {
	static Scanner sc = new Scanner(System.in);
	
	public static void studentlogin() throws Exception{
		System.out.println("Enter roll number");
		int rollno = sc.nextInt();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		int r = Validator.teacherloinvalidation(rollno, password);
	}
}
