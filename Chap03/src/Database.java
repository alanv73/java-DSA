import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	    //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

	    Connection m_Connection = DriverManager.getConnection(
	        "jdbc:sqlserver://localhost; DatabaseName=Movies; integratedSecurity=true;");

	    Statement m_Statement = m_Connection.createStatement();
	    String query = "SELECT * FROM movie";

	    ResultSet m_ResultSet = m_Statement.executeQuery(query);

	    while (m_ResultSet.next()) {
	      System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
	          + m_ResultSet.getString(3));
	    }
	    
	    m_Connection.close();
	}

}
