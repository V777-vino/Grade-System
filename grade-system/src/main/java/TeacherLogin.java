import java.util.Scanner;

public class TeacherLogin {
	static Scanner sc = new Scanner(System.in);

	public static void teacherloginvalid() throws Exception {

		System.out.println("Enter login id");
		int loginid = sc.nextInt();
		System.out.println("Enter password");
		String password = sc.next();
		int r = Validator.teacherloinvalidation(loginid, password);

		if (r == 0) {
			System.out.println("No staffs in this user id");
		}
		if (r == 1) {
			teacherMenu();
		}

	}

	public static void teacherMenu() throws Exception {
		System.out.println("Enter '1' to add student");
		System.out.println("Enter '2' to add marks");
		int a = sc.nextInt();
		while (a >= 3 || a <= 0) {
			System.out.println("Enter a valid key");
			a = sc.nextInt();
		}
		if (a == 1) {
			System.out.println("Student roll number");
			int rollno = sc.nextInt();
			System.out.println("Student Name");
			String studName = sc.next();
			System.out.println("Dob");
			String dob = sc.next();
			System.out.println("Check the student details below");
			System.out.println("Student name=" + studName);
			System.out.println("Student rollno=" + rollno);
			System.out.println("Student name=" + dob);

			System.out.println("Student details registered successfully");

			Const pass = new Const(rollno, studName, dob);
			Dao t = new Dao();
			Dao.studdet(pass);
		}
		if (a == 2) {
			System.out.println("Enter a roll number:");
			int rollno = sc.nextInt();
			System.out.println("Enter a tamil mark:");
			int tamil = sc.nextInt();
			System.out.println("Enter a engish mark:");
			int english = sc.nextInt();
			System.out.println("Enter a maths mark:");
			int maths = sc.nextInt();
			System.out.println("Enter a Science mark:");
			int science = sc.nextInt();
			System.out.println("Enter a Social science mark:");
			int social = sc.nextInt();

			System.out.println("Check the marks below");
			System.out.println("roll number is:" + tamil);
			System.out.println("Tamil mark is:" + english);
			System.out.println("Engish mark is:" + maths);
			System.out.println("Maths mark is:" + science);
			System.out.println("Science mark is:" + science);
			System.out.println("Social mark is:" + social);

			Const1 marks = new Const1(rollno, tamil, english, maths, science, social);
			Dao k = new Dao();
			Dao.studMarks(marks);
			System.out.println("Student marks details reistered successfully");
		}

	}

}
