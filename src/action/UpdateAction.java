package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAction {
	public boolean update(StudentBean b){
		boolean status=false;
		
		Connection con=null;
		int id=Integer.parseInt(b.getId());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ajbaskar","1234");
			
			Statement st=con.createStatement();
			
			
		
			
			
		ResultSet rs=st.executeQuery("update  student set name='"+b.getName()+"',age='"+b.getAge()+"',email='"+b.getEmail()+"',phone='"+b.getNumber()+"',doj='"+b.getDate()+"' where id="+id+"");
				if(rs.next()){
					status=true;
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
