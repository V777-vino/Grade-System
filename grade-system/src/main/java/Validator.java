import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Validator {
	@SuppressWarnings("finally")
	public static int teacherloinvalidation(int loginid, String password) throws SQLException, ClassNotFoundException {
		String query = null;
		int result = 0;
		try {
			query = "select * from teacher_login where id='" + loginid + "' and password='" + password + "'";

			ResultSet rs = call(query);
			while (rs.next()) {
				result++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}

	}

	private static ResultSet call(String query) throws Exception {
		
		Connection connection =Dao.Teacherlogincheck();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}

}
