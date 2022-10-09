import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class Modify_ward implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1,b2,b3;
Modify_ward()
{
f=new JFrame("Update ward details");
        f.setSize(900,650);
        f.setLocation(450,150);
        f.setBackground(Color.white);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter ward_id number to update the data of student");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(500,100,200,30);
        f.add(t1);
         b1 = new JButton("Update");
         b1.setForeground(Color.WHITE);
        b1.setBounds(720,100,100,30);
        f.add(b1);
        b1.addActionListener(this);
	
		
        l2 = new JLabel("Update ward Details");
        l2.setBounds(50,10,500,50);
        l2.setFont(new Font("serif",Font.ITALIC,40));
        l2.setForeground(Color.black);
        f.add(l2);
		l3= new JLabel("Word_no");
        l3.setBounds(50,150,150,30);
      l3.setFont(new Font("serif",Font.BOLD,20));
        f.add(l3);
        t2=new JTextField();   
        t2.setBounds(200,150,150,30);
        f.add(t2);

        l4=new JLabel("Number of beds");
        l4.setBounds(50,200,150,30);
	l4.setFont(new Font("serif",Font.BOLD,20));
        f.add(l4);

        t3=new JTextField();   
        t3.setBounds(200,200,150,30);
        f.add(t3);
		
      l5=new JLabel("location");
        l5.setBounds(50,240,150,30);
	l5.setFont(new Font("serif",Font.BOLD,20));
        f.add(l5);

        t4=new JTextField();   
        t4.setBounds(200,240,150,30);
        f.add(t4);
		
        l6=new JLabel("Dapartment");
        l6.setBounds(50,280,150,30);
	l6.setFont(new Font("serif",Font.BOLD,20));
        f.add(l6);

        t5=new JTextField();   
        t5.setBounds(200,280,150,30);
        f.add(t5);
		/*
		   l7=new JLabel("working_hour");
        l7.setBounds(50,320,150,30);
	l7.setFont(new Font("serif",Font.BOLD,20));
        f.add(l7);

        t6=new JTextField();   
        t6.setBounds(200,320,150,30);
        f.add(t6);
		  l8=new JLabel("Contact_no");
        l8.setBounds(50,360,150,30);
	l8.setFont(new Font("serif",Font.BOLD,20));
        f.add(l8);

        t7=new JTextField();   
        t7.setBounds(200,360,150,30);
        f.add(t7);*/
		
		
		 b2 = new JButton("Submit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,420,150,40);

        f.add(b2);

        b3=new JButton("Cancel");   
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(450,420,150,40);

        f.add(b3);

        b2.addActionListener(this);
        b3.addActionListener(this);
		
		
		
		f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource() == b1){
            try{
                conn con = new conn();
                String str = "select * from Ward where   WORD_NO= '"+t1.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    f.setVisible(true);

                    t2.setText(rs.getString(1));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(4));
                    
				}
				 }catch(Exception ex){}
	 }
 if(ae.getSource()==b2){
            try {   
                conn con = new conn();
                String str = " update Ward set  WORD_NO='"+t2.getText()+"',NOB='"+t3.getText()+"',LOCATION='"+t4.getText()+"',DEPT='"+t5.getText()+"' where WORD_NO='"+t1.getText()+"'"; 
                con.s.executeUpdate(str); 
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new Staff_list();
            }catch(Exception e){
                System.out.println(e);
            }
 }
  if(ae.getSource()==b3)
  {
	  f.setVisible(false);
             new MenuBar().jf.setVisible(true);
        }
 }
		public static void main(String[] arg)
		{
        new Modify_ward();
    }
}  