import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*; 
public class Logine implements ActionListener
{
JFrame jf;
JLabel l1,l2,l3;
JPasswordField jp;
JTextField jt;
JButton jb1,jb2;
Logine()
{
jf=new JFrame("LOGINE FROM");
l1=new JLabel("USER NAME");
l1.setBounds(40,30,120,30);
jf.add(l1);
l2=new JLabel("PASSWORD");
l2.setBounds(40,100,120,30);
jf.add(l2);
jt=new JTextField();
jt.setBounds(170,30,120,30);
jf.add(jt);
jp=new JPasswordField();
jp.setBounds(170,100,120,30);
jf.add(jp);
jb1=new JButton("Logine");
jb1.setBounds(60,180,80,30);
jb1.addActionListener(this);
jf.add(jb1);
jb2=new JButton("Cancel");
jb2.setBounds(150,180,80,30);
jb2.addActionListener(this);
jf.add(jb2);
ImageIcon c1 = new ImageIcon("icons\\second.jpg");
Image im = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
ImageIcon c2=new ImageIcon(im);
l3=new JLabel(c2);
l3.setBounds( 300,20,200,200);
jf.add(l3);
jf.getContentPane().setBackground(Color.WHITE);
jf.setLayout(null);
jf.setSize(550,300);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{ 
try
{
	
	String ur,pass,str=null;
	ur=jt.getText();
	pass=jp.getText();
	String q = "select * from login where username='"+ur+"' and password='"+pass+"'";
	//ResultSet rs = s.executeQuery(q); 
	if(e.getSource()==jb1)
	{
		
		  if(rs.next())
		  {
			jf.setVisible(false);
		new MenuBar();
		  }
else
                JOptionPane.showMessageDialog(null, "Invalid login");
}
}
catch (Exception er){}
	 if(e.getSource()==jb2)
	{
		System.exit(0);
	}
}

public static void main(String ar[])
{
new Logine();
}
}