 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 //import  sql.*;
 public class Dlogin //implements ActionListener
 {
 JFrame fr;
 JLabel l1,l2,l3,l4,l5;
 JTextField t1;
 JPasswordField jp;
 JComboBox c1;
 JButton b1,b2;
  Dlogin()
  {
   fr=new JFrame("login screen");
   l1=new JLabel("LOGIN FORM");
   l1.setForeground(Color.red);
   l1.setBounds(150,30,250,50);
    l1.setFont(new Font("serif",Font.BOLD,30));
    fr.add(l1);
   l2=new JLabel(" User Id");
   l2.setBounds(50,120,100,30);
   fr.add(l2);
   t1=new JTextField();
   t1.setBounds(170,120,100,30);
   fr.add(t1);
   l3=new JLabel("password");
   l3.setBounds(50,170,100,30);
   fr.add(l3);
   jp=new JPasswordField();
   jp.setBounds(170,170,100,30);
   fr.add(jp);
   l4=new JLabel("user type");
   l4.setBounds(50,220,100,30);
   fr.add(l4);
   String usertype[]={"Management","Customer"};
   c1=new JComboBox(usertype);
   c1.setBounds(170,220,100,30);
   fr.add(c1);
   b1=new JButton("Login");
   b1.setBounds(70,270,100,50);
   fr.add(b1);
   b2=new JButton("cancel");
   b2.setBounds(190,270,100,50);
   fr.add(b2);
   fr.setVisible(true);
   fr.setLocation(500,200);
   fr.setSize(500,400);
   fr.setLayout(null);
  }
  /*public void actionPerformed(ActionEvent ae)
  {
   try
   {
    conn c1=new conn();
	String st="select * from dlogin where UserId="+t1.getText+" and password="+jp.getText+"";
	Resultset rs=c1.s.executeQuery(st);
	if(ae.getSource()==b1);
	{
	 if(rs.next())
	 {
	 JOptionPane.showMessageDialog(null,"login successfull");
	 }
	 else
	 JOptionPane.showMessageDialog(null,"Invalid Login");
	}
   }
   catch(Exception er)
   {}
   if(ae.getSource()==b2)
   {
    System.exit(0);
   }
  }*/
  public static void main(String ar[])
  {
   new Dlogin();
  }
 }