import java.util.Scanner;

public class Front_page
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("welcome to our school");
		System.out.println("Teacher login -press: 1");
		System.out.println("Student login -press: 2");
		
	
		int a = sc.nextInt();
		
		while(a>=3 || a<=0){
			System.out.println("Enter a valid key");
			a=sc.nextInt();
		}
		
		if (a == 1) {
			TeacherLogin.teacherloginvalid();
		}
		else if(a==2)
		{
			System.out.println("enter RollNumbrer");
			int rollno = sc.nextInt();
			System.out.println("Enter a Dob");
			String dob = sc.next();
			LoginDAO.loginValidation(rollno, dob);	
			
		}

	}

}
