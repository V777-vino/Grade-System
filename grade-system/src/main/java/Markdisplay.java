import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Markdisplay {
public static void marklist()throws Exception
	
	{
	@SuppressWarnings("resource")
	Scanner obj0=new Scanner(System.in);
	System.out.println("enter Roll Number");
	int rollno1=obj0.nextInt();
	PreparedStatement statement=null;
	ResultSet rs=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//System.out.println(connection);
	String sc = "select * from marks_students  where rollno= ?";
	statement = connection.prepareStatement(sc);
	statement.setInt(1,rollno1);
	rs = statement.executeQuery();
	while (rs.next())
	{
		Integer rollnum = rs.getInt("rollno");
		Integer tamil =rs.getInt("tamil");
		Integer english=rs.getInt("english");
	     Integer science=rs.getInt("science");
	     Integer social=rs.getInt("social");
	     Integer maths=rs.getInt("maths");
		
		
	   int result=tamil+english+science+social+maths;
		
	Const1 allObj = new Const1(rollno1, tamil, english, maths, science, social);
	System.out.println("Applicant Details"+"\nRollNumber:"+allObj.rollno+"\ntamil:"+allObj.tamil+"\nenglish:"+allObj.english+"\nscience:"+allObj.science+"\nsocial:"+allObj.social+"\nmaths:"+allObj.maths);
	System.out.println("Total is...."+result);
	GradeDisplay. grade();
	}
	connection.close();
	}
}
