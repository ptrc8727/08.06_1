package fourth;
import java.sql.*;  

public class RegisterDao {

	public static int register(User u){  
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into register_1(name,email,pass) values(?,?,?)");  
		ps.setString(1,u.getName());  
		ps.setString(2,u.getEmail());  
		ps.setString(3,u.getPass());  
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}
	
}
