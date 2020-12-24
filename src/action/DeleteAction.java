package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeleteAction {
	
	public boolean delete(String id){
		boolean status=false;
		int id1=Integer.parseInt(id);
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ajbaskar","1234");
			Statement st=con.createStatement();
			
			ResultSet rs= st.executeQuery("delete from student where id="+id1+"");
			if(rs.next()){
				status =true;
			}
			
		}catch(Exception e){}
		
		
		
		
		
		return status;
	}

}
