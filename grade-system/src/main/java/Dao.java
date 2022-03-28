import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	public static void studdet(Const pass) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username = "rev_user";
		String password = "rev_user";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String query = "insert into student_grade(roll_num,student_name,DOB) values ('"+pass.rollno+"','"+pass.Name+"','"+pass.dob+"')";
				Statement statement = connection.createStatement();
		int row = statement.executeUpdate(query);
		statement.close();
		connection.close();
		
	}
public static void studMarks(Const1 marks) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
		String username = "rev_user";
		String password = "rev_user";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		String query = "insert into marks_students(rollno,tamil,english,maths,science,social) values ('"+marks.rollno+"','"+marks.tamil+"','"+marks.english+"','"+marks.maths+"','"+marks.science+"','"+marks.social+"')";
				Statement statement = connection.createStatement();
		int row = statement.executeUpdate(query);
		statement.close();
		connection.close();
}
public static Connection Teacherlogincheck() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
	String username = "rev_user";
	String password = "rev_user";
	Connection connection = DriverManager.getConnection(url, username, password);
	return connection;
}
	
}