import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class Modify_Staff implements ActionListener
{
JFrame fa;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1,b2,b3;
Modify_Staff()
{
fa=new JFrame("Update Staff details");
        fa.setSize(900,650);
        fa.setLocation(450,150);
        fa.setBackground(Color.white);
        fa.setLayout(null);

        JLabel l1 = new JLabel("Enter Staff_id number to update the data of student");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        fa.add(l1);

        t1 = new JTextField();
        t1.setBounds(500,100,200,30);
        fa.add(t1);
         b1 = new JButton("Update");
         b1.setForeground(Color.WHITE);
        b1.setBounds(720,100,100,30);
        fa.add(b1);
        b1.addActionListener(this);
        l2 = new JLabel("Update Staff Details:");
        l2.setBounds(50,10,500,50);
        l2.setFont(new Font("serif",Font.ITALIC,40));
        l2.setForeground(Color.black);
        fa.add(l2);
		l3= new JLabel("Eim_id");
        l3.setBounds(50,150,150,30);
      l3.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l3);
        t2=new JTextField();   
        t2.setBounds(200,150,150,30);
        fa.add(t2);

        l4=new JLabel("Emp_Name");
        l4.setBounds(50,200,150,30);
	l4.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l4);

        t3=new JTextField();   
        t3.setBounds(200,200,150,30);
        fa.add(t3);
		
        l5=new JLabel("Desig");
        l5.setBounds(50,240,150,30);
	l5.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l5);

        t4=new JTextField();   
        t4.setBounds(200,240,150,30);
        fa.add(t4);
		
        l6=new JLabel("Dapartment");
        l6.setBounds(50,280,150,30);
	l6.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l6);

        t5=new JTextField();   
        t5.setBounds(200,280,150,30);
        fa.add(t5);
		
		   l7=new JLabel("working_hour");
        l7.setBounds(50,320,150,30);
	l7.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l7);

        t6=new JTextField();   
        t6.setBounds(200,320,150,30);
        fa.add(t6);
		  l8=new JLabel("Contact_no");
        l8.setBounds(50,360,150,30);
	l8.setFont(new Font("serif",Font.BOLD,20));
        fa.add(l8);

        t7=new JTextField();   
        t7.setBounds(200,360,150,30);
        fa.add(t7);
		
		
		 b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,420,150,40);

        fa.add(b2);

        b3=new JButton("Cancel");   
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(450,420,150,40);

        fa.add(b3);

        b2.addActionListener(this);
        b3.addActionListener(this);
		
		
		
		fa.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource() == b1){
            try{
                conn con = new conn();
                String str = "select * from Staff where   EIM_ID= '"+t1.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    fa.setVisible(true);

                    t2.setText(rs.getString(1));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(4));
                    t6.setText(rs.getString(5));
                    t7.setText(rs.getString(6));
				
				}
				 }catch(Exception ex){}
	 }
 if(ae.getSource()==b2){
            try {   
                conn con = new conn();
                String str = " update Staff set  EIM_ID='"+t2.getText()+"',EMP_NAME='"+t3.getText()+"',DESIG='"+t4.getText()+"',DEPT='"+t5.getText()+"', WORKING_HOUR='"+t6.getText()+"', CONATCT_NO='"+t6.getText()+"' where EIM_ID='"+t1.getText()+"'"; 
                con.s.executeUpdate(str); 
                JOptionPane.showMessageDialog(null,"successfully updated");
                fa.setVisible(false);
                new Staff_list();
            }catch(Exception e){
                System.out.println(e);
            }
 }
  if(ae.getSource()==b3)
  {
	  fa.setVisible(false);
             new MenuBar().jf.setVisible(true);
        }
 }
		public static void main(String[] arg)
		{
        new Modify_Staff();
    }
}  