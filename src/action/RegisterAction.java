package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterAction {

	
	
	public boolean register(StudentBean b){
		boolean status=false;
		
		Connection con=null;
		int id=Integer.parseInt(b.getId());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ajbaskar","1234");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from student where id="+id+"");
			
			if(rs.next()){
				status=false;
			}
			else{
				int i=st.executeUpdate("insert into student values('"+b.getId()+"','"+b.getName()+"','"+b.getAge()+"','"+b.getEmail()+"','"+b.getNumber()+"','"+b.getDate()+"')");
				
				if(i>0){
					status=true;
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
}
