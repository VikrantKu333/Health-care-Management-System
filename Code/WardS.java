import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class WardS implements ActionListener
{
JFrame jf;
JLabel l1,l2;
JTextField t1;
JButton b1,b2;
JTable tabel; 
    String x[] = {"ward_id","NOB","LOCATION","DEPT"};
    String y[][] = new String[20][4];
    int i=0, j=0;
WardS()
{
jf=new JFrame("Ward_Search");
l1=new JLabel("Enter the WORD_NO");
l1.setBounds(40,70,200,30);
l1.setFont(new Font("serif",Font.ITALIC,20));
        jf.add(l1);
		t1=new JTextField();
		t1.setBounds(250,70,200,30);
		jf.add(t1);
		b1=new JButton("search");
b1.setBounds(550,70,100,30);
b1.addActionListener(this);
jf.add(b1);			 
jf.setLayout(null);
jf.setBounds(30,50,700,700);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{	
	if(ae.getSource()==b1)
	{
		 try{
            conn c1  = new conn();
            String s1 = "select * from WARD where WORD_NO='"+t1.getText()+"'";
			 ResultSet rs = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString(1);
                y[i][j++]=rs.getString(2);
                y[i][j++]=rs.getString(3);
                y[i][j++]=rs.getString(4);
               
                i++;
                j=0;
            }
       tabel = new JTable(y,x);

        }catch(Exception e){
            System.out.println(e);
        }

        JScrollPane sp = new JScrollPane(tabel);
        sp.setBounds(20,150,490 ,330);
        jf.add(sp);
	
}
}
public static void main(String ar[])
{
new WardS();
}
}
