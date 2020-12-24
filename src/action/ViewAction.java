package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewAction {
	public boolean f=false;
	public StudentBean fetch(String id){
		boolean temp=true;
		StudentBean b=new StudentBean();
		int id1 =Integer.parseInt(id);
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ajbaskar","1234");
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from student where id="+id1+"");
			
			while(rs.next()){
				//checking for valid student Id
				if(temp){
					f=true;
					temp=false;
				}
				b.setId(rs.getString("id"));
				b.setName(rs.getString("name"));
				b.setAge(rs.getString("age"));
				b.setEmail(rs.getString("email"));
				b.setNumber(rs.getString("phone"));
				Date d=rs.getDate("doj");
				SimpleDateFormat sm=new SimpleDateFormat("dd/MMM/yyyy");
				
				b.setDate(sm.format(d));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return b;
	}
}
