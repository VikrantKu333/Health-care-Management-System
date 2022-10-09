import java.sql.*;
class Nal_database
{
public static void main(String a[])
{
try
{
//Class.forName("Oracle.jdbc.driver.OracleDriver");
      Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from student");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2));
}
con.close();
}catch(Exception ex)
{
System.out.println(ex);
}
}
}