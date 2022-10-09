import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Hospital 
{
JFrame jf;
JLabel l1,l2,l3,l4,l5,l6,l7,t1,t3,t4,t5;
JComboBox c1,c2;

Hospital()
{
jf=new JFrame("Hospital detais");
jf.setLayout(new FlowLayout());
	ImageIcon ct = new ImageIcon("icons\\ho.jpg");
Image im = ct.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
ImageIcon im1=new ImageIcon(im);
JLabel jt=new JLabel(im1);
jf.add(jt);
l1=new JLabel("Regno");
l1.setBounds(40,30,80,30);
t1=new JLabel("t-1236287");
t1.setBounds(220,30,150,30);
jt.add(l1);
jt.add(t1);
l2=new JLabel("Hosp_name");
l2.setBounds(40,70,80,30);
l3=new JLabel("RAM HOSPITAL");
l3.setBounds(220,70,150,30);
jt.add(l2);
jt.add(l3);
l4=new JLabel("Hospital _type");
l4.setBounds(40,110,80,30);
t3=new JLabel("Emergency24*7");
t3.setBounds(220,110,150,30);
jt.add(l4);
jt.add(t3);
l5=new JLabel("Location");
l5.setBounds(40,150,150,30);
jt.add(l5);
  t4=new JLabel("rt rode durgapur");
	t4.setBounds(220,150,100,30);
	jt.add(t4);
	l6=new JLabel("contact_no");
	l6.setBounds(40,190,150,30);
	jt.add(l6);
	t5=new JLabel("837298332");
	t5.setBounds(220,190,150,30);
	jt.add(t5);
	jf.setSize(600,600);
	jf.setVisible(true);	
}
public static void main(String ar[])
{
new Hospital();
}
}