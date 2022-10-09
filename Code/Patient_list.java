import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Patient_list
{
JFrame jf;
JTable t1; 
    String x[] = {"Patient_id","patient_Name","Age","Blood_group","Diseases","Date of addmit","Conatct_no"};
    String y[][] = new String[20][7];
    int i=0, j=0;
	
	Patient_list()
	{
	jf=new JFrame("LIST");
        try{
            conn c1  = new conn();
            String s1 = "select * from patient";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString(1);
                y[i][j++]=rs.getString(2);
                y[i][j++]=rs.getString(3);
                y[i][j++]=rs.getString(4);
                y[i][j++]=rs.getString(5);
                y[i][j++]=rs.getString(6);
				y[i][j++]=rs.getString(7);
                i++;
                j=0;
            }
            t1 = new JTable(y,x);

        }catch(Exception e){
            System.out.println(e);
        }

        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        jf.add(sp);
	
 //  sp.getContentPane().setBackground(Color.WHITE);
   jf.setLayout(null);
jf.setSize(1300,500);
jf.setVisible(true);
}
public static void main(String ar[])
{
new Patient_list();
}
}
