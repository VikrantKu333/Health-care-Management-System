import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
public class Doctor implements ActionListener
{
JFrame jf;
JLabel l1,l2,l3,l4,l5,l6,l7;
JComboBox c1,c2;
JTextField t1,t2,t3,t4,t5,t6;
JButton b1,b2;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
Doctor()
{
jf=new JFrame("DoctorDetails");
jf.setLayout(null);
	ImageIcon ct = new ImageIcon("icons\\rt.jpg");
Image im = ct.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
ImageIcon im1=new ImageIcon(im);
JLabel jt=new JLabel(im1);
jf.add(jt);
l1=new JLabel("Doctor_id");
l1.setBounds(40,30,80,30);
t1=new JTextField();
t1.setBounds(220,30,150,30);
  t1.setText("12"+first);
jt.add(l1);
jt.add(t1);
l2=new JLabel("Doctor_Name");
l2.setBounds(40,70,80,30);
t2=new JTextField();
t2.setBounds(220,70,150,30);
jt.add(l2);
jt.add(t2);
l3=new JLabel("working_time");
l3.setBounds(40,110,80,30);
t3=new JTextField();
t3.setBounds(220,110,150,30);
jt.add(l3);   
jt.add(t3);
String Specialization[] = {"Cardiology (Heart Care)","Oncology (Cancer Care)","Neurology","Urology","Surgical","Gastroenterology","Physician"};
l4=new JLabel("Specialization");
l4.setBounds(40,150,150,30);
jt.add(l4);
        c1=new JComboBox(Specialization);
	c1.setBounds(220,150,150,30);
	jt.add(c1);
	String Dept[]={"Icu","Genral","op.theatr"};
	l5=new JLabel("Dapartment");
l5.setBounds(40,190,150,30);
jt.add(l5);
	c2=new JComboBox(Dept);
	c2.setBounds(220,190,150,30);
	jt.add(c2);
	l6=new JLabel("Contact_no.");
	l6.setBounds(40,230,150,30);
	jt.add(l6);
	t4=new JTextField();
	t4.setBounds(220,230,150,30);
	jt.add(t4);
	b1=new JButton("ADD");
	b1.setBounds(70,300,100,30);
	b1.addActionListener(this);
	jt.add(b1);
	b2=new JButton("Clear");
	b2.setBounds(220,300,100,30);
	b2.addActionListener(this);
	jt.add(b2);
	l7=new JLabel("Consult for top most doctor");
	 l7.setFont(new Font("serif",Font.BOLD,30));
	l7.setBounds(40,400,500,40);
	jt.add(l7);
	jf.setSize(600,600);
	jf.setVisible(true);	
}
 public void actionPerformed(ActionEvent ae)
 {
	   String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
		 String d = (String)c1.getSelectedItem();
        String e = (String)c2.getSelectedItem();
		    String f = t4.getText();
		 if(ae.getSource() == b1)
		 {
		 
				 try{
                conn cc = new conn();
                String q = "insert into doctor values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+f+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Inserted Successfully");
                jf.setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b2){
           jf.setVisible(false);
            new MenuBar().jf.setVisible(true);

        }

 } 
public static void main(String ar[])
{
new Doctor();
}
}