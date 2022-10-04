package DatabaseTesting;

import java.sql.*;
public class WorkerDao {
	Connection con=null;
	public void connect() {
		try {
			String url="jdbc:mysql://localhost:3306/company";
			String username="root";
			String password="root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	public Worker getInformation(Worker w1) {
		try {
			String query="select * from worker";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("|Worker Id:"+rs.getInt("worker_id"));
				System.out.println("|First Name:"+rs.getString("first_name"));
				System.out.println("|Last Name:"+rs.getString("last_name"));
				System.out.println("|Salary :"+rs.getInt("salary"));
				System.out.println("|Department :"+rs.getString("department"));
				System.out.println("......................................");
				
				}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
}
