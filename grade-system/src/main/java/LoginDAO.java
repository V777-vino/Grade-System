import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
			public static int loginValidation( int rollno,String dob) throws Exception
		{
			
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		
		String query = "SELECT roll_num,dob FROM student_grade WHERE roll_num='"+rollno+"'";
		Statement st = (Statement) connection.createStatement();
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		int rollno1 = 0;
		String dob1=null;
		while(rs.next())
		{
	     rollno1=rs.getInt("roll_num");
		 dob1=rs.getString("dob");
		
		}
		if(rollno<0)
		{
		
			connection.close();
		throw new Exception("No Records Found");
		}
		else if(dob1.equals(dob))
		{
		System.out.println("You are logged in!");
		connection.close();
		}
		else
		{
		connection.close();
		throw new Exception("Invalid details");
		
		}
		return rollno1;
		
	}
}