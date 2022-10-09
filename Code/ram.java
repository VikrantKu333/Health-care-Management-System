import java.sql.*;
import java.util.*; 
public class ram
{
public static void main(String ar[])
{
	try{
//Class.forName("oracle.jdbc.driver.oracleDriver");
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection tp=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
Statement st=tp.createStatement();
ResultSet rs=st.executeQuery("Select * from doctor");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
	
	tp.close();
	}
	catch(Exception e)
	{
	 System.out.println(e); 

}
}
}