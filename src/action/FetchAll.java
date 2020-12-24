package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FetchAll {
   public boolean f=false;
   public List<StudentBean> fetchAllData(){
	   boolean temp=true;
	   List<StudentBean>  li=new ArrayList<StudentBean>();
	   Connection con=null;
	   try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ajbaskar","1234");
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from student");
			
			while(rs.next()){
				if(temp){
					f=true;
					temp=false;
				}
				StudentBean b=new StudentBean();
				b.setId(rs.getString("id"));
				b.setName(rs.getString("name"));
				b.setAge(rs.getString("age"));
				b.setEmail(rs.getString("email"));
				b.setNumber(rs.getString("phone"));
				Date d=rs.getDate("doj");
				SimpleDateFormat sm=new SimpleDateFormat("dd/MMM/yyyy");
				
				b.setDate(sm.format(d));
				li.add(b);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	   
	   
	   
	   
	   
	   
	   return li;
   }
	
	
}
